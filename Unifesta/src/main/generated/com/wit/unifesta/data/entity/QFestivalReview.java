package com.wit.unifesta.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFestivalReview is a Querydsl query type for FestivalReview
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFestivalReview extends EntityPathBase<FestivalReview> {

    private static final long serialVersionUID = -52396101L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFestivalReview festivalReview = new QFestivalReview("festivalReview");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> likedCount = createNumber("likedCount", Integer.class);

    public final DateTimePath<java.time.LocalDateTime> localDateTime = createDateTime("localDateTime", java.time.LocalDateTime.class);

    public final StringPath reviewContent = createString("reviewContent");

    public final QUserFestivalReview userFestivalReview;

    public QFestivalReview(String variable) {
        this(FestivalReview.class, forVariable(variable), INITS);
    }

    public QFestivalReview(Path<? extends FestivalReview> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFestivalReview(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFestivalReview(PathMetadata metadata, PathInits inits) {
        this(FestivalReview.class, metadata, inits);
    }

    public QFestivalReview(Class<? extends FestivalReview> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.userFestivalReview = inits.isInitialized("userFestivalReview") ? new QUserFestivalReview(forProperty("userFestivalReview"), inits.get("userFestivalReview")) : null;
    }

}

