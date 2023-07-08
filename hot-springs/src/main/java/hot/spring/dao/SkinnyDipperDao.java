package hot.spring.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import hot.spring.entity.SkinnyDipper;

public interface SkinnyDipperDao extends JpaRepository<SkinnyDipper, Long> {

	Optional<SkinnyDipper> findBySkinnyDipperEmail(String skinnyDipperEmail);

}
