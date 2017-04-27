package org.iets3.req.core.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.menus.transformation.TransformationMenuBase;
import java.util.Set;
import jetbrains.mps.internal.collections.runtime.SetSequence;
import java.util.HashSet;
import jetbrains.mps.lang.editor.menus.transformation.MenuLocations;
import org.jetbrains.annotations.NotNull;
import java.util.List;
import jetbrains.mps.lang.editor.menus.MenuPart;
import jetbrains.mps.openapi.editor.menus.transformation.TransformationMenuItem;
import jetbrains.mps.openapi.editor.menus.transformation.TransformationMenuContext;
import java.util.ArrayList;
import jetbrains.mps.internal.collections.runtime.ListSequence;
import com.mbeddr.mpsutil.grammarcells.runtime.menu.GrammarCellsTransformationMenuPart;
import org.jetbrains.mps.openapi.module.SModule;
import org.jetbrains.mps.openapi.module.SRepository;
import org.jetbrains.mps.openapi.persistence.PersistenceFacade;

public class template_GrammarCellsSideTransformationsMenu extends TransformationMenuBase {
  public template_GrammarCellsSideTransformationsMenu() {
    super(true);
  }
  private final Set<String> myLocations = SetSequence.fromSetAndArray(new HashSet<String>(), MenuLocations.LEFT_SIDE_TRANSFORM, MenuLocations.RIGHT_SIDE_TRANSFORM);
  @Override
  public boolean isApplicableToLocation(@NotNull String location) {
    return SetSequence.fromSet(myLocations).contains(location);
  }

  @Override
  @NotNull
  protected List<MenuPart<TransformationMenuItem, TransformationMenuContext>> getParts(TransformationMenuContext _context) {
    List<MenuPart<TransformationMenuItem, TransformationMenuContext>> result = new ArrayList<MenuPart<TransformationMenuItem, TransformationMenuContext>>();
    if (ListSequence.fromListAndArray(new ArrayList<String>(), MenuLocations.LEFT_SIDE_TRANSFORM, MenuLocations.RIGHT_SIDE_TRANSFORM).contains(_context.getMenuLocation())) {
      result.add(new template_GrammarCellsSideTransformationsMenu.GrammarCellsTransformationMenuPart_ebe1tt_a0());
    }
    return result;
  }

  private class GrammarCellsTransformationMenuPart_ebe1tt_a0 extends GrammarCellsTransformationMenuPart {
    @Override
    public SModule getModule(SRepository repository) {
      return PersistenceFacade.getInstance().createModuleReference("a3c6f642-41b7-44cb-951b-463b8427a245(org.iets3.req.core)").resolve(repository);
    }
  }
}
