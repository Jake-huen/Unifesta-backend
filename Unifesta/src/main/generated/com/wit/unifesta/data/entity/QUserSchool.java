package com.wit.unifesta.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserSchool is a Querydsl query type for UserSchool
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserSchool extends EntityPathBase<UserSchool> {

    private static final long serialVersionUID = 1684990314L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserSchool userSchool = new QUserSchool("userSchool");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> likedCount = createNumber("likedCount", Integer.class);

    public final QSchool school;

    public final QUser user;

    public QUserSchool(String variable) {
        this(UserSchool.class, forVariable(variable), INITS);
    }

    public QUserSchool(Path<? extends UserSchool> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUserSchool(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUserSchool(PathMetadata metadata, PathInits inits) {
        this(UserSchool.class, metadata, inits);
    }

    public QUserSchool(Class<? extends UserSchool> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.school = inits.isInitialized("school") ? new QSchool(forProperty("school"), inits.get("school")) : null;
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

