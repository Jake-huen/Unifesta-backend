package com.wit.unifesta.data.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;
import com.querydsl.core.types.dsl.PathInits;


/**
 * QCelebrity is a Querydsl query type for Celebrity
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QCelebrity extends EntityPathBase<Celebrity> {

    private static final long serialVersionUID = 327651896L;

    public static final QCelebrity celebrity = new QCelebrity("celebrity");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final ListPath<SchoolCelebrity, QSchoolCelebrity> schoolCelebrities = this.<SchoolCelebrity, QSchoolCelebrity>createList("schoolCelebrities", SchoolCelebrity.class, QSchoolCelebrity.class, PathInits.DIRECT2);

    public final StringPath singerImage = createString("singerImage");

    public final StringPath singerName = createString("singerName");

    public final NumberPath<Long> totalLiked = createNumber("totalLiked", Long.class);

    public QCelebrity(String variable) {
        super(Celebrity.class, forVariable(variable));
    }

    public QCelebrity(Path<? extends Celebrity> path) {
        super(path.getType(), path.getMetadata());
    }

    public QCelebrity(PathMetadata metadata) {
        super(Celebrity.class, metadata);
    }

}

