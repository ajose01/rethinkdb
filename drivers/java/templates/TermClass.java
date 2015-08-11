package com.rethinkdb.ast.query.gen;

import com.rethinkdb.ast.gen.ReqlQuery;
import com.rethinkdb.proto.TermType;

import java.util.List;
import java.util.Map;


public class ${dromedary(term)} extends ReqlQuery {
    public ${camel(term)}(ReqlQuery prev, List<java.lang.Object> args, Map<String, java.lang.Object> kwargs){
        super(prev, TermType.${term}, args, kwargs);
    }
}
