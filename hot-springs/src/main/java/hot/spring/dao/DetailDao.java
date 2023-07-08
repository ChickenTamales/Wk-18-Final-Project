package hot.spring.dao;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;

import hot.spring.entity.Detail;

public interface DetailDao extends JpaRepository<Detail, Long> {

	Set<Detail> findAllByDetailIn(Set<String> details);

}
