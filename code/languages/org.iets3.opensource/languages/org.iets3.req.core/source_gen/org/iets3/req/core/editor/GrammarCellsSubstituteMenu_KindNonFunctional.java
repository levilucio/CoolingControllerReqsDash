package org.iets3.req.core.editor;

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

public class GrammarCellsSubstituteMenu_KindNonFunctional extends SubstituteMenuBase {
  public GrammarCellsSubstituteMenu_KindNonFunctional() {
    super(true);
  }
  @NotNull
  @Override
  protected List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> getParts(final SubstituteMenuContext _context) {
    List<MenuPart<SubstituteMenuItem, SubstituteMenuContext>> result = new ArrayList<MenuPart<SubstituteMenuItem, SubstituteMenuContext>>();
    result.add(new GrammarCellsSubstituteMenu_KindNonFunctional.GrammarCellsSubstituteMenuPart_bv1aeo_a());
    return result;
  }
  private class GrammarCellsSubstituteMenuPart_bv1aeo_a extends GrammarCellsSubstituteMenuPart {
    @Override
    public SModule getModule(SRepository repository) {
      return PersistenceFacade.getInstance().createModuleReference("a3c6f642-41b7-44cb-951b-463b8427a245(org.iets3.req.core)").resolve(repository);
    }
    @Override
    public SAbstractConcept getExpectedOutputConcept() {
      return MetaAdapterFactory.getConcept(0xa3c6f64241b744cbL, 0x951b463b8427a245L, 0xb54392f5f81ecf4L, "org.iets3.req.core.structure.KindNonFunctional");
    }
  }
}
