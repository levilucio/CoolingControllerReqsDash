package org.iets3.table.coolingbehaviortable.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private final ConceptPresentation props_CoolingBehaviorIncDecCell = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_CoolingBehaviorRow = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_CoolingBehaviorTable = new ConceptPresentationBuilder().icon(IconContainer.RESOURCE_a0a0c).create();
  private final ConceptPresentation props_DecreasingThreshold = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_DecreasingValue = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_DutyCycleVal = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_IncreasingThreshold = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_IncreasingValue = new ConceptPresentationBuilder().create();

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case 0:
        return props_CoolingBehaviorIncDecCell;
      case 1:
        return props_CoolingBehaviorRow;
      case 2:
        return props_CoolingBehaviorTable;
      case 3:
        return props_DecreasingThreshold;
      case 4:
        return props_DecreasingValue;
      case 5:
        return props_DutyCycleVal;
      case 6:
        return props_IncreasingThreshold;
      case 7:
        return props_IncreasingValue;
    }
    throw new IllegalStateException("Unknown concept " + c);
  }
}
