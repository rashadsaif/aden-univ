package com.adenuniv.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adenuniv.model.Year;

public interface YearRepository
		extends JpaRepository<Year, Long>{
//, QueryDslPredicateExecutor<Year>, QuerydslBinderCustomizer<QYear> {

//	default public void customize(QuerydslBindings bindings, QYear root) {
//		bindings.bind(String.class).first((StringPath path, String value) -> path.containsIgnoreCase(value));
//		//bindings.excluding(root.id);
//	}

}
