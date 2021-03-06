package org.iets3.core.attributes.behavior;

/*Generated by MPS */

import jetbrains.mps.core.aspects.behaviour.BaseBHDescriptor;
import org.jetbrains.mps.openapi.language.SAbstractConcept;
import jetbrains.mps.smodel.adapter.structure.MetaAdapterFactory;
import jetbrains.mps.core.aspects.behaviour.api.BehaviorRegistry;
import jetbrains.mps.smodel.language.ConceptRegistry;
import jetbrains.mps.core.aspects.behaviour.api.SMethod;
import jetbrains.mps.core.aspects.behaviour.SMethodBuilder;
import jetbrains.mps.core.aspects.behaviour.SJavaCompoundTypeImpl;
import jetbrains.mps.core.aspects.behaviour.SModifiersImpl;
import jetbrains.mps.core.aspects.behaviour.AccessPrivileges;
import java.awt.Color;
import java.util.List;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SConceptOperations;
import jetbrains.mps.lang.smodel.generator.smodelAdapter.SNodeOperations;
import jetbrains.mps.lang.core.behavior.BaseConcept__BehaviorDescriptor;
import jetbrains.mps.core.aspects.behaviour.api.SConstructor;
import org.jetbrains.annotations.Nullable;
import jetbrains.mps.core.aspects.behaviour.api.BHMethodNotFoundException;

public final class IAttribute__BehaviorDescriptor extends BaseBHDescriptor {
  private static final SAbstractConcept CONCEPT = MetaAdapterFactory.getInterfaceConcept(0x583939beded04735L, 0xa055a74f8477fc34L, 0x3ce7d489744328bbL, "org.iets3.core.attributes.structure.IAttribute");
  private static final BehaviorRegistry REGISTRY = ConceptRegistry.getInstance().getBehaviorRegistry();

  public static final SMethod<String> summaryString_id4A8SzOVam5y = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("summaryString").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("4A8SzOVam5y").registry(REGISTRY).build();
  public static final SMethod<Color> summaryColor_id4A8SzOVam5R = new SMethodBuilder<Color>(new SJavaCompoundTypeImpl(Color.class)).name("summaryColor").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("4A8SzOVam5R").registry(REGISTRY).build();
  public static final SMethod<String> label_id1HqphBIQCVt = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("label").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("1HqphBIQCVt").registry(REGISTRY).build();
  public static final SMethod<String> qualifiedPresentation_id1HqphBJ7K9P = new SMethodBuilder<String>(new SJavaCompoundTypeImpl(String.class)).name("qualifiedPresentation").modifiers(SModifiersImpl.create(8, AccessPrivileges.PUBLIC)).concept(CONCEPT).id("1HqphBJ7K9P").registry(REGISTRY).build();

  private static final List<SMethod<?>> BH_METHODS = Arrays.<SMethod<?>>asList(summaryString_id4A8SzOVam5y, summaryColor_id4A8SzOVam5R, label_id1HqphBIQCVt, qualifiedPresentation_id1HqphBJ7K9P);

  private static void ___init___(@NotNull SNode __thisNode__) {
  }

  /*package*/ static String summaryString_id4A8SzOVam5y(@NotNull SNode __thisNode__) {
    return null;
  }
  /*package*/ static Color summaryColor_id4A8SzOVam5R(@NotNull SNode __thisNode__) {
    return null;
  }
  /*package*/ static String label_id1HqphBIQCVt(@NotNull SNode __thisNode__) {
    return SConceptOperations.conceptAlias(SNodeOperations.getConcept(__thisNode__));
  }
  /*package*/ static String qualifiedPresentation_id1HqphBJ7K9P(@NotNull SNode __thisNode__) {
    return BaseConcept__BehaviorDescriptor.getPresentation_idhEwIMiw.invoke(SNodeOperations.getParent(__thisNode__)) + "." + IAttribute__BehaviorDescriptor.label_id1HqphBIQCVt.invoke(__thisNode__);
  }

  /*package*/ IAttribute__BehaviorDescriptor() {
    super(REGISTRY);
  }

  @Override
  protected void initNode(@NotNull SNode node, @NotNull SConstructor constructor, @Nullable Object[] parameters) {
    ___init___(node);
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SNode node, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      case 0:
        return (T) ((String) summaryString_id4A8SzOVam5y(node));
      case 1:
        return (T) ((Color) summaryColor_id4A8SzOVam5R(node));
      case 2:
        return (T) ((String) label_id1HqphBIQCVt(node));
      case 3:
        return (T) ((String) qualifiedPresentation_id1HqphBJ7K9P(node));
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @Override
  protected <T> T invokeSpecial0(@NotNull SAbstractConcept concept, @NotNull SMethod<T> method, @Nullable Object[] parameters) {
    int methodIndex = BH_METHODS.indexOf(method);
    if (methodIndex < 0) {
      throw new BHMethodNotFoundException(this, method);
    }
    switch (methodIndex) {
      default:
        throw new BHMethodNotFoundException(this, method);
    }
  }

  @NotNull
  @Override
  public List<SMethod<?>> getDeclaredMethods() {
    return BH_METHODS;
  }

  @NotNull
  @Override
  public SAbstractConcept getConcept() {
    return CONCEPT;
  }
}
