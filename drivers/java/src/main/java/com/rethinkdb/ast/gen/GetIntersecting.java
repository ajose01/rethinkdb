// Autogenerated by nvert_protofile.py on 2015-05-05.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/AstSubclass.java
package com.rethinkdb.ast.gen;

import com.rethinkdb.ast.helper.Arguments;
import com.rethinkdb.ast.helper.OptArgs;
import com.rethinkdb.ast.RqlAst;
import com.rethinkdb.proto.TermType;
import java.util.*;

public class GetIntersecting extends RqlQuery {

    public GetIntersecting(RqlAst prev, Arguments args, OptArgs optargs) {
        this(prev, TermType.GET_INTERSECTING, args, optargs);
    }
    protected GetIntersecting(RqlAst previous, TermType termType, Arguments args, OptArgs optargs){
        super(previous, termType, args, optargs);
    }
    /* Query level terms */
}
