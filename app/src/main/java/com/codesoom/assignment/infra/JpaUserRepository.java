package com.codesoom.assignment.infra;

import com.codesoom.assignment.domain.User;
import com.codesoom.assignment.domain.UserRepository;
import java.util.Optional;
import org.springframework.context.annotation.Primary;
import org.springframework.data.repository.CrudRepository;

/**
 * User JPA 데이터 저장소
 */
@Primary
public interface JpaUserRepository
        extends UserRepository, CrudRepository<User, Long> {
    Optional<User> findById(Long id);

    User save(User user);

    void delete(User user);

    void deleteAll();

    boolean existsByEmail(String email);
}