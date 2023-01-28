package com.wit.unifesta.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QFestivalCalendar is a Querydsl query type for FestivalCalendar
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFestivalCalendar extends EntityPathBase<FestivalCalendar> {

    private static final long serialVersionUID = 1269823201L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QFestivalCalendar festivalCalendar = new QFestivalCalendar("festivalCalendar");

    public final QAuditingFields _super = new QAuditingFields(this);

    public final StringPath addressName = createString("addressName");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> createdAt = _super.createdAt;

    public final StringPath eveningTime = createString("eveningTime");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath morningTime = createString("morningTime");

    public final StringPath performanceTime = createString("performanceTime");

    public final QSchool school;

    public final StringPath subway = createString("subway");

    public final StringPath totalDate = createString("totalDate");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> updatedAt = _super.updatedAt;

    public QFestivalCalendar(String variable) {
        this(FestivalCalendar.class, forVariable(variable), INITS);
    }

    public QFestivalCalendar(Path<? extends FestivalCalendar> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QFestivalCalendar(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QFestivalCalendar(PathMetadata metadata, PathInits inits) {
        this(FestivalCalendar.class, metadata, inits);
    }

    public QFestivalCalendar(Class<? extends FestivalCalendar> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.school = inits.isInitialized("school") ? new QSchool(forProperty("school"), inits.get("school")) : null;
    }

}

