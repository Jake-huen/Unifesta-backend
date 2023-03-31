package com.wit.unifesta.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QUserFestivalReview is a Querydsl query type for UserFestivalReview
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QUserFestivalReview extends EntityPathBase<UserFestivalReview> {

    private static final long serialVersionUID = -1245521178L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QUserFestivalReview userFestivalReview = new QUserFestivalReview("userFestivalReview");

    public final QFestivalReview festivalReview;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.time.LocalDateTime> localDateTime = createDateTime("localDateTime", java.time.LocalDateTime.class);

    public final QSchool school;

    public final QUser user;

    public QUserFestivalReview(String variable) {
        this(UserFestivalReview.class, forVariable(variable), INITS);
    }

    public QUserFestivalReview(Path<? extends UserFestivalReview> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QUserFestivalReview(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QUserFestivalReview(PathMetadata metadata, PathInits inits) {
        this(UserFestivalReview.class, metadata, inits);
    }

    public QUserFestivalReview(Class<? extends UserFestivalReview> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.festivalReview = inits.isInitialized("festivalReview") ? new QFestivalReview(forProperty("festivalReview"), inits.get("festivalReview")) : null;
        this.school = inits.isInitialized("school") ? new QSchool(forProperty("school"), inits.get("school")) : null;
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

