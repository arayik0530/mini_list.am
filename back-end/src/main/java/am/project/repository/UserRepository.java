package am.project.repository;

import am.project.domain.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Query(value = "from UserEntity as user where user.firstName like ?1% and user.lastName like ?2% " +
            "OR user.firstName like ?2% and user.lastName like ?2% " +
            "OR user.firstName like ?1% or user.firstName like ?2% " +
            "OR user.lastName like ?1% or user.lastName like ?2%")
    Page<UserEntity> searchByName(String firstName, String lastName, Pageable pageable);


    Optional<UserEntity> findByMail(String mail);
}
