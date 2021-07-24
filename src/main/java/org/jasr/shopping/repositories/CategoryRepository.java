package org.jasr.shopping.repositories;

        import org.jasr.shopping.entities.Category;
        import org.jasr.shopping.entities.Product;
        import org.springframework.data.repository.CrudRepository;
        import org.springframework.data.repository.PagingAndSortingRepository;
        import org.springframework.data.rest.core.annotation.RepositoryRestResource;

public interface CategoryRepository extends PagingAndSortingRepository<Category, Long>
{
}
