package com.adenuniv.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.adenuniv.model.Subject;

public interface SubjectRepository
		extends JpaRepository<Subject, Long>{
//, QueryDslPredicateExecutor<Subject>, QuerydslBinderCustomizer<QSubject> {

//	default public void customize(QuerydslBindings bindings, QSubject root) {
//		bindings.bind(String.class).first((StringPath path, String value) -> path.containsIgnoreCase(value));
//		//bindings.excluding(root.id);
//	}

}
