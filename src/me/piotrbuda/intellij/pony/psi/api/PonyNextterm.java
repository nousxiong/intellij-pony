// This is a generated file. Not intended for manual editing.
package me.piotrbuda.intellij.pony.psi.api;

import com.intellij.psi.PsiElement;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public interface PonyNextterm extends PsiElement {

    @Nullable
    PonyCap getCap();

    @NotNull
    List<PonyCaseexpr> getCaseexprList();

    @Nullable
    PonyElseif getElseif();

    @Nullable
    PonyIdseq getIdseq();

    @Nullable
    PonyNextpostfix getNextpostfix();

    @NotNull
    List<PonyRawseq> getRawseqList();

    @Nullable
    PonyTerm getTerm();

    @Nullable
    PonyType getType();

    @NotNull
    List<PonyWithelem> getWithelemList();

}
