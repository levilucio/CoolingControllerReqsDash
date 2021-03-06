package org.iets3.req.core.editor;

/*Generated by MPS */

import jetbrains.mps.openapi.editor.style.Style;
import jetbrains.mps.openapi.editor.cells.EditorCell;
import org.jetbrains.mps.openapi.model.SNode;
import jetbrains.mps.openapi.editor.EditorContext;
import jetbrains.mps.editor.runtime.style.StyleAttributes;
import jetbrains.mps.openapi.editor.style.StyleRegistry;
import jetbrains.mps.editor.runtime.style.StyleImpl;
import com.mbeddr.mpsutil.userstyles.runtime.plugin.UserStyleAttributesUtil;
import jetbrains.mps.nodeEditor.MPSFonts;
import java.awt.Color;
import jetbrains.mps.nodeEditor.MPSColors;

public class requirements_StyleSheet {
  public static void apply_title(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    style.set(StyleAttributes.FONT_STYLE, 0, requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a0a(editorContext, node));
    style.set(StyleAttributes.TEXT_COLOR, 0, StyleRegistry.getInstance().getSimpleColor(requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a1a(editorContext, node)));
    if (requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a2a(editorContext, node)) {
      {
        Style styleToPut = new StyleImpl();
        requirements_StyleSheet.apply_requirements_title_missingTextBackgroundColor(styleToPut, editorCell);
        style.putAll(styleToPut, 0);
      }
    }
    if (requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a3a(editorContext, node)) {
      {
        Style styleToPut = new StyleImpl();
        requirements_StyleSheet.apply_requirements_title_missingUnderlined(styleToPut, editorCell);
        style.putAll(styleToPut, 0);
      }
    }
    if (requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a4a(editorContext, node)) {
      {
        Style styleToPut = new StyleImpl();
        requirements_StyleSheet.apply_requirements_title_missingStrikeout(styleToPut, editorCell);
        style.putAll(styleToPut, 0);
      }
    }
  }
  public static void apply_properties(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    style.set(StyleAttributes.TEXT_COLOR, 0, StyleRegistry.getInstance().getSimpleColor(requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a0b(editorContext, node)));
    if (requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a1b(editorContext, node)) {
      {
        Style styleToPut = new StyleImpl();
        requirements_StyleSheet.apply_requirements_properties_missingTextBackgroundColor(styleToPut, editorCell);
        style.putAll(styleToPut, 0);
      }
    }
    if (requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a2b(editorContext, node)) {
      {
        Style styleToPut = new StyleImpl();
        requirements_StyleSheet.apply_requirements_properties_missingUnderlined(styleToPut, editorCell);
        style.putAll(styleToPut, 0);
      }
    }
    if (requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a3b(editorContext, node)) {
      {
        Style styleToPut = new StyleImpl();
        requirements_StyleSheet.apply_requirements_properties_missingStrikeout(styleToPut, editorCell);
        style.putAll(styleToPut, 0);
      }
    }
    if (requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a4b(editorContext, node)) {
      {
        Style styleToPut = new StyleImpl();
        requirements_StyleSheet.apply_requirements_properties_missingFontStyle(styleToPut, editorCell);
        style.putAll(styleToPut, 0);
      }
    }
  }
  public static void apply_tags(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    style.set(StyleAttributes.TEXT_COLOR, 0, StyleRegistry.getInstance().getSimpleColor(requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a0c(editorContext, node)));
    if (requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a1c(editorContext, node)) {
      {
        Style styleToPut = new StyleImpl();
        requirements_StyleSheet.apply_requirements_tags_missingTextBackgroundColor(styleToPut, editorCell);
        style.putAll(styleToPut, 0);
      }
    }
    if (requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a2c(editorContext, node)) {
      {
        Style styleToPut = new StyleImpl();
        requirements_StyleSheet.apply_requirements_tags_missingUnderlined(styleToPut, editorCell);
        style.putAll(styleToPut, 0);
      }
    }
    if (requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a3c(editorContext, node)) {
      {
        Style styleToPut = new StyleImpl();
        requirements_StyleSheet.apply_requirements_tags_missingStrikeout(styleToPut, editorCell);
        style.putAll(styleToPut, 0);
      }
    }
    if (requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a4c(editorContext, node)) {
      {
        Style styleToPut = new StyleImpl();
        requirements_StyleSheet.apply_requirements_tags_missingFontStyle(styleToPut, editorCell);
        style.putAll(styleToPut, 0);
      }
    }
  }
  public static void apply_requirements_title_missingTextBackgroundColor(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    style.set(StyleAttributes.TEXT_BACKGROUND_COLOR, 0, StyleRegistry.getInstance().getSimpleColor(requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a0d(editorContext, node)));
  }
  public static void apply_requirements_title_missingUnderlined(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    style.set(StyleAttributes.UNDERLINED, 0, requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a0e(editorContext, node));
  }
  public static void apply_requirements_title_missingStrikeout(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    style.set(StyleAttributes.STRIKE_OUT, 0, requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a0f(editorContext, node));
  }
  public static void apply_requirements_properties_missingTextBackgroundColor(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    style.set(StyleAttributes.TEXT_BACKGROUND_COLOR, 0, StyleRegistry.getInstance().getSimpleColor(requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a0g(editorContext, node)));
  }
  public static void apply_requirements_properties_missingUnderlined(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    style.set(StyleAttributes.UNDERLINED, 0, requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a0h(editorContext, node));
  }
  public static void apply_requirements_properties_missingStrikeout(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    style.set(StyleAttributes.STRIKE_OUT, 0, requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a0i(editorContext, node));
  }
  public static void apply_requirements_properties_missingFontStyle(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    style.set(StyleAttributes.FONT_STYLE, 0, requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a0j(editorContext, node));
  }
  public static void apply_requirements_tags_missingTextBackgroundColor(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    style.set(StyleAttributes.TEXT_BACKGROUND_COLOR, 0, StyleRegistry.getInstance().getSimpleColor(requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a0k(editorContext, node)));
  }
  public static void apply_requirements_tags_missingUnderlined(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    style.set(StyleAttributes.UNDERLINED, 0, requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a0l(editorContext, node));
  }
  public static void apply_requirements_tags_missingStrikeout(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    style.set(StyleAttributes.STRIKE_OUT, 0, requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a0m(editorContext, node));
  }
  public static void apply_requirements_tags_missingFontStyle(Style style, EditorCell editorCell) {
    SNode node = (editorCell == null ? null : editorCell.getSNode());
    EditorContext editorContext = (editorCell == null ? null : editorCell.getContext());
    style.set(StyleAttributes.FONT_STYLE, 0, requirements_StyleSheet._StyleParameter_QueryFunction_m4c9c8_a0n(editorContext, node));
  }

  private static int _StyleParameter_QueryFunction_m4c9c8_a0a(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.getFontStyle("org.iets3.req.core.editor.requirements.title", MPSFonts.BOLD);
  }
  private static Color _StyleParameter_QueryFunction_m4c9c8_a1a(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.getForegroundColor("org.iets3.req.core.editor.requirements.title", StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_BLUE));
  }
  private static boolean _StyleParameter_QueryFunction_m4c9c8_a2a(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.hasBackgroundColor("org.iets3.req.core.editor.requirements.title");
  }
  private static boolean _StyleParameter_QueryFunction_m4c9c8_a3a(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.hasUnderlined("org.iets3.req.core.editor.requirements.title");
  }
  private static boolean _StyleParameter_QueryFunction_m4c9c8_a4a(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.hasStrikeout("org.iets3.req.core.editor.requirements.title");
  }
  private static Color _StyleParameter_QueryFunction_m4c9c8_a0b(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.getForegroundColor("org.iets3.req.core.editor.requirements.properties", StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_GREEN));
  }
  private static boolean _StyleParameter_QueryFunction_m4c9c8_a1b(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.hasBackgroundColor("org.iets3.req.core.editor.requirements.properties");
  }
  private static boolean _StyleParameter_QueryFunction_m4c9c8_a2b(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.hasUnderlined("org.iets3.req.core.editor.requirements.properties");
  }
  private static boolean _StyleParameter_QueryFunction_m4c9c8_a3b(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.hasStrikeout("org.iets3.req.core.editor.requirements.properties");
  }
  private static boolean _StyleParameter_QueryFunction_m4c9c8_a4b(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.hasFontStyle("org.iets3.req.core.editor.requirements.properties");
  }
  private static Color _StyleParameter_QueryFunction_m4c9c8_a0c(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.getForegroundColor("org.iets3.req.core.editor.requirements.tags", StyleRegistry.getInstance().getSimpleColor(MPSColors.DARK_MAGENTA));
  }
  private static boolean _StyleParameter_QueryFunction_m4c9c8_a1c(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.hasBackgroundColor("org.iets3.req.core.editor.requirements.tags");
  }
  private static boolean _StyleParameter_QueryFunction_m4c9c8_a2c(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.hasUnderlined("org.iets3.req.core.editor.requirements.tags");
  }
  private static boolean _StyleParameter_QueryFunction_m4c9c8_a3c(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.hasStrikeout("org.iets3.req.core.editor.requirements.tags");
  }
  private static boolean _StyleParameter_QueryFunction_m4c9c8_a4c(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.hasFontStyle("org.iets3.req.core.editor.requirements.tags");
  }
  private static Color _StyleParameter_QueryFunction_m4c9c8_a0d(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.getBackgroundColor("org.iets3.req.core.editor.requirements.title", (Color) null);
  }
  private static boolean _StyleParameter_QueryFunction_m4c9c8_a0e(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.isUnderlined("org.iets3.req.core.editor.requirements.title", false);
  }
  private static boolean _StyleParameter_QueryFunction_m4c9c8_a0f(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.isStrikeout("org.iets3.req.core.editor.requirements.title", false);
  }
  private static Color _StyleParameter_QueryFunction_m4c9c8_a0g(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.getBackgroundColor("org.iets3.req.core.editor.requirements.properties", (Color) null);
  }
  private static boolean _StyleParameter_QueryFunction_m4c9c8_a0h(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.isUnderlined("org.iets3.req.core.editor.requirements.properties", false);
  }
  private static boolean _StyleParameter_QueryFunction_m4c9c8_a0i(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.isStrikeout("org.iets3.req.core.editor.requirements.properties", false);
  }
  private static int _StyleParameter_QueryFunction_m4c9c8_a0j(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.getFontStyle("org.iets3.req.core.editor.requirements.properties", MPSFonts.PLAIN);
  }
  private static Color _StyleParameter_QueryFunction_m4c9c8_a0k(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.getBackgroundColor("org.iets3.req.core.editor.requirements.tags", (Color) null);
  }
  private static boolean _StyleParameter_QueryFunction_m4c9c8_a0l(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.isUnderlined("org.iets3.req.core.editor.requirements.tags", false);
  }
  private static boolean _StyleParameter_QueryFunction_m4c9c8_a0m(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.isStrikeout("org.iets3.req.core.editor.requirements.tags", false);
  }
  private static int _StyleParameter_QueryFunction_m4c9c8_a0n(EditorContext editorContext, SNode node) {
    return UserStyleAttributesUtil.getFontStyle("org.iets3.req.core.editor.requirements.tags", MPSFonts.PLAIN);
  }
}
