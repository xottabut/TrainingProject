package com.intellias.training.part1.editor;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.METHOD, ElementType.LOCAL_VARIABLE})
public @interface ByteResult {
}
