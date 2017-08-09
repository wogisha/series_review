package cs544.week2.repositories;

import cs544.week2.model.SerieSummary;
import org.springframework.data.jpa.repository.JpaRepository;

import cs544.week2.entities.Serie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface SerieRepository extends JpaRepository<Serie, Long> {

    @Query("select s from Serie s where lower(s.name) like concat('%',:name) ")
    List<Serie> findSeriesQuery(@Param("name") String name);

    @Query("select new cs544.week2.model.SerieSummary(s,count(seasons),count(episodes)) from Serie s left join s.seasons seasons left join seasons.episodes episodes where s.id = :id group by s.id ")
    SerieSummary findSerieSummary(@Param("id") Long id);

    @Query("select new cs544.week2.model.SerieSummary(s,count(seasons),count(episodes)) from Serie s" +
            " left join s.seasons seasons left join seasons.episodes episodes where " +
            " lower(s.name) like concat('%', :query,'%')  " +
            " or lower(s.genre) like concat('%', :query,'%')  " +
            " group by s.id")
    List<SerieSummary> findSeriesSummary(@Param("query") String query);
}
