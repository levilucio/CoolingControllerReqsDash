package org.iets3.flow.property.formulae.structure;

/*Generated by MPS */

import jetbrains.mps.smodel.runtime.BaseStructureAspectDescriptor;
import java.util.Map;
import jetbrains.mps.smodel.adapter.ids.SConceptId;
import java.util.HashMap;
import jetbrains.mps.smodel.runtime.ConceptDescriptor;
import java.util.Collection;
import java.util.Arrays;
import org.jetbrains.annotations.Nullable;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.concept.SConceptAdapterById;
import jetbrains.mps.smodel.adapter.structure.concept.SInterfaceConceptAdapterById;
import jetbrains.mps.smodel.runtime.impl.ConceptDescriptorBuilder;
import jetbrains.mps.smodel.adapter.ids.MetaIdFactory;
import jetbrains.mps.smodel.SNodePointer;

public class StructureAspectDescriptor extends BaseStructureAspectDescriptor {
  private final Map<SConceptId, Integer> myIndexMap = new HashMap<SConceptId, Integer>(8);
  /*package*/ final ConceptDescriptor myConceptAndPropertyFormula = createDescriptorForAndPropertyFormula();
  /*package*/ final ConceptDescriptor myConceptAtomicProperty = createDescriptorForAtomicProperty();
  /*package*/ final ConceptDescriptor myConceptBinaryPropertyFormula = createDescriptorForBinaryPropertyFormula();
  /*package*/ final ConceptDescriptor myConceptImplicationPropertyFormula = createDescriptorForImplicationPropertyFormula();
  /*package*/ final ConceptDescriptor myConceptNotPropertyFormula = createDescriptorForNotPropertyFormula();
  /*package*/ final ConceptDescriptor myConceptOrPropertyFormula = createDescriptorForOrPropertyFormula();
  /*package*/ final ConceptDescriptor myConceptPropertyFormula = createDescriptorForPropertyFormula();
  /*package*/ final ConceptDescriptor myConceptUnaryPropertyFormula = createDescriptorForUnaryPropertyFormula();

  public StructureAspectDescriptor() {
    myIndexMap.put(myConceptAndPropertyFormula.getId(), 0);
    myIndexMap.put(myConceptAtomicProperty.getId(), 1);
    myIndexMap.put(myConceptBinaryPropertyFormula.getId(), 2);
    myIndexMap.put(myConceptImplicationPropertyFormula.getId(), 3);
    myIndexMap.put(myConceptNotPropertyFormula.getId(), 4);
    myIndexMap.put(myConceptOrPropertyFormula.getId(), 5);
    myIndexMap.put(myConceptPropertyFormula.getId(), 6);
    myIndexMap.put(myConceptUnaryPropertyFormula.getId(), 7);
  }

  @Override
  public Collection<ConceptDescriptor> getDescriptors() {
    return Arrays.asList(myConceptAndPropertyFormula, myConceptAtomicProperty, myConceptBinaryPropertyFormula, myConceptImplicationPropertyFormula, myConceptNotPropertyFormula, myConceptOrPropertyFormula, myConceptPropertyFormula, myConceptUnaryPropertyFormula);
  }

  @Override
  @Nullable
  public ConceptDescriptor getDescriptor(SConceptId id) {
    Integer index = myIndexMap.get(id);
    if (index == null) {
      return null;
    }
    switch (((int) index)) {
      case 0:
        return myConceptAndPropertyFormula;
      case 1:
        return myConceptAtomicProperty;
      case 2:
        return myConceptBinaryPropertyFormula;
      case 3:
        return myConceptImplicationPropertyFormula;
      case 4:
        return myConceptNotPropertyFormula;
      case 5:
        return myConceptOrPropertyFormula;
      case 6:
        return myConceptPropertyFormula;
      case 7:
        return myConceptUnaryPropertyFormula;
      default:
        throw new IllegalStateException();
    }
  }

  /*package*/ int internalIndex(SAbstractConcept c) {
    Integer res = null;
    if (c instanceof SConceptAdapterById) {
      res = myIndexMap.get(((SConceptAdapterById) c).getId());
    } else if (c instanceof SInterfaceConceptAdapterById) {
      res = myIndexMap.get(((SInterfaceConceptAdapterById) c).getId());
    }
    return (res == null ? -1 : res);
  }

  private static ConceptDescriptor createDescriptorForAndPropertyFormula() {
    return new ConceptDescriptorBuilder("org.iets3.flow.property.formulae.structure.AndPropertyFormula", MetaIdFactory.conceptId(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334dbL)).super_("jetbrains.mps.lang.core.structure.BaseConcept").version(1).super_(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).parents("jetbrains.mps.lang.core.structure.BaseConcept", "org.iets3.flow.property.formulae.structure.BinaryPropertyFormula").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL), MetaIdFactory.conceptId(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d5L)).rootable().alias("AND", "").sourceNode(new SNodePointer("r:afc6f445-2ccb-416f-bf5b-6cd26b99557c(org.iets3.flow.property.formulae.structure)", "4439542802417923291")).create();
  }
  private static ConceptDescriptor createDescriptorForAtomicProperty() {
    return new ConceptDescriptorBuilder("org.iets3.flow.property.formulae.structure.AtomicProperty", MetaIdFactory.conceptId(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x691240ff880dbb0aL)).super_("jetbrains.mps.lang.smodel.structure.ConceptIdRefExpression").version(1).super_(MetaIdFactory.conceptId(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x24b2bf7ce180eb54L)).parents("jetbrains.mps.lang.smodel.structure.ConceptIdRefExpression", "org.iets3.flow.property.formulae.structure.PropertyFormula").parentIds(MetaIdFactory.conceptId(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x24b2bf7ce180eb54L), MetaIdFactory.conceptId(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d4L)).childDescriptors(new ConceptDescriptorBuilder.Link(0x2ec4396c8796488cL, "property", MetaIdFactory.conceptId(0x7866978ea0f04cc7L, 0x81bc4d213d9375e1L, 0x24b2bf7ce180eb54L), false, false, false, new SNodePointer("r:afc6f445-2ccb-416f-bf5b-6cd26b99557c(org.iets3.flow.property.formulae.structure)", "3369881559473997964"))).children(new String[]{"property"}, new boolean[]{false}).rootable().sourceNode(new SNodePointer("r:afc6f445-2ccb-416f-bf5b-6cd26b99557c(org.iets3.flow.property.formulae.structure)", "7571185389806664458")).create();
  }
  private static ConceptDescriptor createDescriptorForBinaryPropertyFormula() {
    return new ConceptDescriptorBuilder("org.iets3.flow.property.formulae.structure.BinaryPropertyFormula", MetaIdFactory.conceptId(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d5L)).version(1).interface_().parents("org.iets3.flow.property.formulae.structure.PropertyFormula").parentIds(MetaIdFactory.conceptId(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d4L)).childDescriptors(new ConceptDescriptorBuilder.Link(0x2745279545540786L, "arg1", MetaIdFactory.conceptId(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d4L), false, false, false, new SNodePointer("r:afc6f445-2ccb-416f-bf5b-6cd26b99557c(org.iets3.flow.property.formulae.structure)", "2829711462938969990")), new ConceptDescriptorBuilder.Link(0x274527954554078cL, "arg2", MetaIdFactory.conceptId(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d4L), false, false, false, new SNodePointer("r:afc6f445-2ccb-416f-bf5b-6cd26b99557c(org.iets3.flow.property.formulae.structure)", "2829711462938969996"))).children(new String[]{"arg1", "arg2"}, new boolean[]{false, false}).sourceNode(new SNodePointer("r:afc6f445-2ccb-416f-bf5b-6cd26b99557c(org.iets3.flow.property.formulae.structure)", "4439542802417923285")).create();
  }
  private static ConceptDescriptor createDescriptorForImplicationPropertyFormula() {
    return new ConceptDescriptorBuilder("org.iets3.flow.property.formulae.structure.ImplicationPropertyFormula", MetaIdFactory.conceptId(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334e3L)).super_("jetbrains.mps.lang.core.structure.BaseConcept").version(1).super_(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).parents("jetbrains.mps.lang.core.structure.BaseConcept", "org.iets3.flow.property.formulae.structure.BinaryPropertyFormula").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL), MetaIdFactory.conceptId(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d5L)).alias("IMPLICATION", "").sourceNode(new SNodePointer("r:afc6f445-2ccb-416f-bf5b-6cd26b99557c(org.iets3.flow.property.formulae.structure)", "4439542802417923299")).create();
  }
  private static ConceptDescriptor createDescriptorForNotPropertyFormula() {
    return new ConceptDescriptorBuilder("org.iets3.flow.property.formulae.structure.NotPropertyFormula", MetaIdFactory.conceptId(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334e6L)).super_("jetbrains.mps.lang.core.structure.BaseConcept").version(1).super_(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).parents("jetbrains.mps.lang.core.structure.BaseConcept", "org.iets3.flow.property.formulae.structure.UnaryPropertyFormula").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL), MetaIdFactory.conceptId(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d8L)).rootable().alias("NOT", "").sourceNode(new SNodePointer("r:afc6f445-2ccb-416f-bf5b-6cd26b99557c(org.iets3.flow.property.formulae.structure)", "4439542802417923302")).create();
  }
  private static ConceptDescriptor createDescriptorForOrPropertyFormula() {
    return new ConceptDescriptorBuilder("org.iets3.flow.property.formulae.structure.OrPropertyFormula", MetaIdFactory.conceptId(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334deL)).super_("jetbrains.mps.lang.core.structure.BaseConcept").version(1).super_(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL)).parents("jetbrains.mps.lang.core.structure.BaseConcept", "org.iets3.flow.property.formulae.structure.BinaryPropertyFormula").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x10802efe25aL), MetaIdFactory.conceptId(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d5L)).rootable().alias("OR", "").sourceNode(new SNodePointer("r:afc6f445-2ccb-416f-bf5b-6cd26b99557c(org.iets3.flow.property.formulae.structure)", "4439542802417923294")).create();
  }
  private static ConceptDescriptor createDescriptorForPropertyFormula() {
    return new ConceptDescriptorBuilder("org.iets3.flow.property.formulae.structure.PropertyFormula", MetaIdFactory.conceptId(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d4L)).version(1).interface_().parents("jetbrains.mps.lang.core.structure.INamedConcept").parentIds(MetaIdFactory.conceptId(0xceab519525ea4f22L, 0x9b92103b95ca8c0cL, 0x110396eaaa4L)).sourceNode(new SNodePointer("r:afc6f445-2ccb-416f-bf5b-6cd26b99557c(org.iets3.flow.property.formulae.structure)", "4439542802417923284")).create();
  }
  private static ConceptDescriptor createDescriptorForUnaryPropertyFormula() {
    return new ConceptDescriptorBuilder("org.iets3.flow.property.formulae.structure.UnaryPropertyFormula", MetaIdFactory.conceptId(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d8L)).version(1).interface_().parents("org.iets3.flow.property.formulae.structure.PropertyFormula").parentIds(MetaIdFactory.conceptId(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d4L)).childDescriptors(new ConceptDescriptorBuilder.Link(0x274527954554078fL, "arg", MetaIdFactory.conceptId(0xc020a239d8654312L, 0xadc3cb4ab0a7a547L, 0x3d9c6ca8374334d4L), false, false, false, new SNodePointer("r:afc6f445-2ccb-416f-bf5b-6cd26b99557c(org.iets3.flow.property.formulae.structure)", "2829711462938969999"))).children(new String[]{"arg"}, new boolean[]{false}).sourceNode(new SNodePointer("r:afc6f445-2ccb-416f-bf5b-6cd26b99557c(org.iets3.flow.property.formulae.structure)", "4439542802417923288")).create();
  }
}
