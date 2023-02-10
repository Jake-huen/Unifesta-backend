package com.wit.unifesta.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QSchoolCelebrity is a Querydsl query type for SchoolCelebrity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QSchoolCelebrity extends EntityPathBase<SchoolCelebrity> {

    private static final long serialVersionUID = 521905508L;

    private static final PathInits INITS = PathInits.DIRECT2;

    public static final QSchoolCelebrity schoolCelebrity = new QSchoolCelebrity("schoolCelebrity");

    public final QCelebrity celebrity;

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final QSchool school;

    public QSchoolCelebrity(String variable) {
        this(SchoolCelebrity.class, forVariable(variable), INITS);
    }

    public QSchoolCelebrity(Path<? extends SchoolCelebrity> path) {
        this(path.getType(), path.getMetadata(), PathInits.getFor(path.getMetadata(), INITS));
    }

    public QSchoolCelebrity(PathMetadata metadata) {
        this(metadata, PathInits.getFor(metadata, INITS));
    }

    public QSchoolCelebrity(PathMetadata metadata, PathInits inits) {
        this(SchoolCelebrity.class, metadata, inits);
    }

    public QSchoolCelebrity(Class<? extends SchoolCelebrity> type, PathMetadata metadata, PathInits inits) {
        super(type, metadata, inits);
        this.celebrity = inits.isInitialized("celebrity") ? new QCelebrity(forProperty("celebrity")) : null;
        this.school = inits.isInitialized("school") ? new QSchool(forProperty("school"), inits.get("school")) : null;
    }

}

