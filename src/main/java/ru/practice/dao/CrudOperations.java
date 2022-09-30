package ru.practice.dao;

import lombok.NonNull;
import org.springframework.data.repository.NoRepositoryBean;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.List;


@NoRepositoryBean
public interface CrudOperations<T, ID> {

    @Nullable
    T findById(@NonNull ID id);

    @Nonnull
    List<T> findAll();

    @Nonnull
    T update(@Nonnull T entity);

    @Nullable
    T delete(@Nonnull ID id);

    @Nullable
    Integer create(@Nonnull T entity);

    void deleteAll();
}
