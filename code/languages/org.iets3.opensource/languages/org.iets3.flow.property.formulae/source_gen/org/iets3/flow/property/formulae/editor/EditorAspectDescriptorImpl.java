package org.iets3.flow.property.formulae.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import org.jetbrains.annotations.NotNull;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase {
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    {
      SAbstractConcept cncpt = ((SAbstractConcept) concept);
      Integer preIndex = indices_xbvbvu_a0a.get(cncpt);
      int switchIndex = (preIndex == null ? -1 : preIndex);
      switch (switchIndex) {
        case 0:
          if (true) {
            return Collections.<ConceptEditor>singletonList(new AndPropertyFormula_Editor());
          }
          break;
        case 1:
          if (true) {
            return Collections.<ConceptEditor>singletonList(new AtomicProperty_Editor());
          }
          break;
        case 2:
          if (true) {
            return Collections.<ConceptEditor>singletonList(new ImplicationPropertyFormula_Editor());
          }
          break;
        case 3:
          if (true) {
            return Collections.<ConceptEditor>singletonList(new NotPropertyFormula_Editor());
          }
          break;
        case 4:
          if (true) {
            return Collections.<ConceptEditor>singletonList(new OrPropertyFormula_Editor());
          }
          break;
        default:
      }
    }
    return Collections.<ConceptEditor>emptyList();
  }



  private static Map<SAbstractConcept, Integer> buildConceptIndices(SAbstractConcept... concepts) {
    HashMap<SAbstractConcept, Integer> res = new HashMap<SAbstractConcept, Integer>();
    int counter = 0;
    for (SAbstractConcept c : concepts) {
      res.put(c, counter++);
    }
    return res;
  }
  private static final Map<SAbstractConcept, Integer> indices_xbvbvu_a0a = buildConceptIndices(MetaAdapterFactory.getConcept(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334dbL, "org.iets3.flow.property.formulae.structure.AndPropertyFormula"), MetaAdapterFactory.getConcept(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x691240ff880dbb0aL, "org.iets3.flow.property.formulae.structure.AtomicProperty"), MetaAdapterFactory.getConcept(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334e3L, "org.iets3.flow.property.formulae.structure.ImplicationPropertyFormula"), MetaAdapterFactory.getConcept(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334e6L, "org.iets3.flow.property.formulae.structure.NotPropertyFormula"), MetaAdapterFactory.getConcept(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334deL, "org.iets3.flow.property.formulae.structure.OrPropertyFormula"));
}
