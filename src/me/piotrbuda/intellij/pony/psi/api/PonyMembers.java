// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.api;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;

import java.util.List;

public interface PonyMembers extends PsiElement {

    @NotNull
    List<PonyField> getFieldList();

    @NotNull
    List<PonyMethod> getMethodList();

}
