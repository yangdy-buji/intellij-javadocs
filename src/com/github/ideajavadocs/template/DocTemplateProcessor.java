package com.github.ideajavadocs.template;

import org.jetbrains.annotations.NotNull;

import java.util.Map;

public interface DocTemplateProcessor {

    @NotNull
    String process(@NotNull String template, @NotNull Map<String, String> params);

}