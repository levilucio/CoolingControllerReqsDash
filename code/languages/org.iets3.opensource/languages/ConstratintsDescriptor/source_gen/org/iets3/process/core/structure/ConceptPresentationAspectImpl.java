package org.iets3.process.core.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private final ConceptPresentation props_CopyProperty = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_FlowChunk = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_FlowState = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_FlowStatePointer = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_InformationString = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_NodeCreationProperty = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_PropertyExtender = new ConceptPresentationBuilder().create();

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case 0:
        return props_CopyProperty;
      case 1:
        return props_FlowChunk;
      case 2:
        return props_FlowState;
      case 3:
        return props_FlowStatePointer;
      case 4:
        return props_InformationString;
      case 5:
        return props_NodeCreationProperty;
      case 6:
        return props_PropertyExtender;
    }
    throw new IllegalStateException("Unknown concept " + c);
  }
}
