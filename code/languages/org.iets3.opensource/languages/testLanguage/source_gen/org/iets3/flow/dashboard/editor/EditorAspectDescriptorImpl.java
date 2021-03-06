package org.iets3.flow.dashboard.editor;

/*Generated by MPS */

import jetbrains.mps.nodeEditor.EditorAspectDescriptorBase;
import jetbrains.mps.openapi.editor.descriptor.EditorHintsProvider;
import java.util.Collection;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditorHint;
import java.util.Arrays;
import jetbrains.mps.editor.runtime.desctiptor.ConceptEditorHintImpl;
import org.jetbrains.annotations.NotNull;
import jetbrains.mps.openapi.editor.descriptor.ConceptEditor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import java.util.Collections;
import jetbrains.mps.openapi.editor.descriptor.TransformationMenu;
import java.util.Map;
import java.util.HashMap;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;

public class EditorAspectDescriptorImpl extends EditorAspectDescriptorBase implements EditorHintsProvider {
  private Collection<ConceptEditorHint> myHints = Arrays.<ConceptEditorHint>asList(new ConceptEditorHintImpl("TabularView", "This is a Tabular View of the flowModel", true, "org.iets3.flow.dashboard.editor.DashboardVisualisation.TabularView"), new ConceptEditorHintImpl("Textual", "This is a Textual Editor of the flowModel", true, "org.iets3.flow.dashboard.editor.DashboardVisualisation.Textual"), new ConceptEditorHintImpl("DirectedGraph", "This is a Directed Graph of the flowModel", true, "org.iets3.flow.dashboard.editor.DashboardVisualisation.DirectedGraph"));
  @NotNull
  public Collection<ConceptEditor> getDeclaredEditors(SAbstractConcept concept) {
    {
      SAbstractConcept cncpt = ((SAbstractConcept) concept);
      Integer preIndex = indices_xbvbvu_a0b.get(cncpt);
      int switchIndex = (preIndex == null ? -1 : preIndex);
      switch (switchIndex) {
        case 0:
          if (true) {
            return Arrays.asList(new ConceptEditor[]{new DashboardHintDisplayer_Editor(), new DashboardHintDisplayer_TabularView_Editor(), new DashboardHintDisplayer_Textual_Editor()});
          }
          break;
        case 1:
          if (true) {
            return Collections.<ConceptEditor>singletonList(new FlowData_Editor());
          }
          break;
        case 2:
          if (true) {
            return Arrays.asList(new ConceptEditor[]{new State_DirectedGraph_Editor(), new State_Editor(), new State_Textual_Editor()});
          }
          break;
        case 3:
          if (true) {
            return Arrays.asList(new ConceptEditor[]{new StatePointer_Editor(), new StatePointer_Textual_Editor()});
          }
          break;
        default:
      }
    }
    return Collections.<ConceptEditor>emptyList();
  }

  public Collection<ConceptEditorHint> getHints() {
    return myHints;
  }

  @NotNull
  @Override
  public Collection<TransformationMenu> getDeclaredDefaultTransformationMenus(SAbstractConcept concept) {
    {
      SAbstractConcept cncpt = concept;
      Integer preIndex = indices_xbvbvu_a0f.get(cncpt);
      int switchIndex = (preIndex == null ? -1 : preIndex);
      switch (switchIndex) {
        case 0:
          if (true) {
            return Collections.<TransformationMenu>singletonList(new DashboardHintDisplayer_TransformationMenu());
          }
          break;
        default:
      }
    }
    return Collections.<TransformationMenu>emptyList();
  }

  private static Map<SAbstractConcept, Integer> buildConceptIndices(SAbstractConcept... concepts) {
    HashMap<SAbstractConcept, Integer> res = new HashMap<SAbstractConcept, Integer>();
    int counter = 0;
    for (SAbstractConcept c : concepts) {
      res.put(c, counter++);
    }
    return res;
  }
  private static final Map<SAbstractConcept, Integer> indices_xbvbvu_a0b = buildConceptIndices(MetaAdapterFactory.getConcept(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x20fc30679cdcee4aL, "org.iets3.flow.dashboard.structure.DashboardHintDisplayer"), MetaAdapterFactory.getConcept(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x3b5f775e0d415b00L, "org.iets3.flow.dashboard.structure.FlowData"), MetaAdapterFactory.getConcept(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x5337259791ac255eL, "org.iets3.flow.dashboard.structure.State"), MetaAdapterFactory.getConcept(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x73258383c7270020L, "org.iets3.flow.dashboard.structure.StatePointer"));
  private static final Map<SAbstractConcept, Integer> indices_xbvbvu_a0f = buildConceptIndices(MetaAdapterFactory.getConcept(0x102111329b5e427aL, 0x9b371c1f28794a5eL, 0x20fc30679cdcee4aL, "org.iets3.flow.dashboard.structure.DashboardHintDisplayer"));
}
