package org.iets3.core.attributes.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.ConceptPresentationAspectBase;
import jetbrains.mps.smodel.runtime.ConceptPresentation;
import jetbrains.mps.smodel.runtime.ConceptPresentationBuilder;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;

public class ConceptPresentationAspectImpl extends ConceptPresentationAspectBase {
  private final ConceptPresentation props_AttributeValue = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_IAttribute = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_IAttributed = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_IComputedValueAttribute = new ConceptPresentationBuilder().create();
  private final ConceptPresentation props_IValueAttribute = new ConceptPresentationBuilder().create();

  @Override
  @Nullable
  public ConceptPresentation getDescriptor(SAbstractConcept c) {
    StructureAspectDescriptor structureDescriptor = (StructureAspectDescriptor) myLanguageRuntime.getAspect(jetbrains.mps.smodel.runtime.StructureAspectDescriptor.class);
    switch (structureDescriptor.internalIndex(c)) {
      case 0:
        return props_AttributeValue;
      case 1:
        return props_IAttribute;
      case 2:
        return props_IAttributed;
      case 3:
        return props_IComputedValueAttribute;
      case 4:
        return props_IValueAttribute;
    }
    throw new IllegalStateException("Unknown concept " + c);
  }
}
