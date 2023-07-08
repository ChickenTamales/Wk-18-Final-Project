package hot.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import hot.spring.entity.HotSpring;

public interface HotSpringDao extends JpaRepository<HotSpring, Long> {

}
