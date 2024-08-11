package org.zerock.guestbook.entity;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QMmember is a Querydsl query type for Mmember
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QMmember extends EntityPathBase<Mmember> {

    private static final long serialVersionUID = 1116511997L;

    public static final QMmember mmember = new QMmember("mmember");

    public final QBaseEntity _super = new QBaseEntity(this);

    public final StringPath email = createString("email");

    public final NumberPath<Long> mid = createNumber("mid", Long.class);

    //inherited
    public final DateTimePath<java.time.LocalDateTime> modDate = _super.modDate;

    public final StringPath nickname = createString("nickname");

    public final StringPath pw = createString("pw");

    //inherited
    public final DateTimePath<java.time.LocalDateTime> regDate = _super.regDate;

    public QMmember(String variable) {
        super(Mmember.class, forVariable(variable));
    }

    public QMmember(Path<? extends Mmember> path) {
        super(path.getType(), path.getMetadata());
    }

    public QMmember(PathMetadata metadata) {
        super(Mmember.class, metadata);
    }

}

