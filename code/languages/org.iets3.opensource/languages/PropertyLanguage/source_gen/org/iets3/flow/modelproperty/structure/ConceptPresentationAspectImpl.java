package org.iets3.flow.modelproperty.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private final ConceptPresentation props_EmptyRequirementProperty = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_EmptyTableProperty = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ErrorFreeTableProperty = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_GlossaryTermDefinedProperty = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ModelProperty = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_ProjectIsCreatedProperty = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_RequirementsChunkNotPresentProperty = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_RequirementsErrorFreeProperty = new ConceptPresentationBuilder().create();

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case 0:
        return props_EmptyRequirementProperty;
      case 1:
        return props_EmptyTableProperty;
      case 2:
        return props_ErrorFreeTableProperty;
      case 3:
        return props_GlossaryTermDefinedProperty;
      case 4:
        return props_ModelProperty;
      case 5:
        return props_ProjectIsCreatedProperty;
      case 6:
        return props_RequirementsChunkNotPresentProperty;
      case 7:
        return props_RequirementsErrorFreeProperty;
    }
    throw new IllegalStateException("Unknown concept " + c);
  }
}
