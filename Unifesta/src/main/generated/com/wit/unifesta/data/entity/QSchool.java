package com.wit.unifesta.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSchool is a Querydsl query type for School
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSchool extends EntityPathBase<School> {

    private static final long serialVersionUID = -1326107841L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSchool school = new QSchool("school");

    public final QAuditingFields _super = new QAuditingFields(this);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final QFestivalCalendar festivalCalendar;

    public final StringPath festivalDescription = createString("festivalDescription");

    public final ListPath<FestivalReview, QFestivalReview> festivalReviewList = this.<FestivalReview, QFestivalReview>createList("festivalReviewList", FestivalReview.class, QFestivalReview.class, PathInits.DIRECT2);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath schoolName = createString("schoolName");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public final QUser user;

    public QSchool(String variable) {
        this(School.class, forVariable(variable), INITS);
    }

    public QSchool(Path<? extends School> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSchool(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSchool(PathMetadata metadata, PathInits inits) {
        this(School.class, metadata, inits);
    }

    public QSchool(Class<? extends School> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.festivalCalendar = inits.isInitialized("festivalCalendar") ? new QFestivalCalendar(forProperty("festivalCalendar"), inits.get("festivalCalendar")) : null;
        this.user = inits.isInitialized("user") ? new QUser(forProperty("user")) : null;
    }

}

