package org.iets3.glossary.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.menus.substitute.SubstituteMenuBase;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.lang.editor.menus.MenuPart;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuItem;
import jetbrains.mps.openapi.editor.menus.substitute.SubstituteMenuContext;
import java.util.ArrayList;
import com.mbeddr.mpsutil.grammarcells.runtime.menu.GrammarCellsSubstituteMenuPart;
import org.jetbrains.mps.openapi.module.SModule;
import org.jetbrains.mps.openapi.module.SRepository;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class GrammarCellsSubstituteMenu_GlossaryChunk extends SubstituteMenuBase {
  public GrammarCellsSubstituteMenu_GlossaryChunk() {
    super(true);
  }
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new GrammarCellsSubstituteMenu_GlossaryChunk.GrammarCellsSubstituteMenuPart_iin92h_a());
    return result;
  }
  private class GrammarCellsSubstituteMenuPart_iin92h_a extends GrammarCellsSubstituteMenuPart {
    @Override
    public SModule getModule(SRepository repository) {
      return PersistenceFacade.getInstance().createModuleReference("8e4e17de-bc10-4a34-a376-a243fbde540e(org.iets3.glossary)").resolve(repository);
    }
    @Override
    public SAbstractConcept getExpectedOutputConcept() {
      return MetaAdapterFactory.getConcept(0x8e4e17debc104a34L, 0xa376a243fbde540eL, 0x68caade118d74a56L, "org.iets3.glossary.structure.GlossaryChunk");
    }
  }
}
