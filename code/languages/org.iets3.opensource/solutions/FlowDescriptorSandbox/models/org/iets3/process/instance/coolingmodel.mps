<?xml version="1.0" encoding="UTF-8"?>
<model ref="r:19a41b7e-210a-408f-b767-7b11608be270(org.iets3.process.instance.coolingmodel)">
  <persistence version="9" />
  <languages>
    <use id="e8ac6d12-64b2-4478-bf9a-80cbf4ec8c16" name="org.iets3.process.core" version="-1" />
    <use id="c020a239-d865-4312-adc3-cb4ab0a7a547" name="org.iets3.process.modelproperty.formulae" version="-1" />
    <use id="10211132-9b5e-427a-9b37-1c1f28794a5e" name="org.iets3.process.dashboard" version="-1" />
    <use id="a3c6f642-41b7-44cb-951b-463b8427a245" name="org.iets3.req.core" version="-1" />
    <use id="f95247f1-a285-4e98-864f-7f4b1723a807" name="org.iets3.core.users" version="-1" />
    <use id="8e4e17de-bc10-4a34-a376-a243fbde540e" name="org.iets3.glossary" version="-1" />
    <use id="2374bc90-7e37-41f1-a9c4-c2e35194c36a" name="com.mbeddr.doc" version="-1" />
    <use id="7a870bb7-87b6-411e-92c2-eb3e9e856127" name="org.iets3.req.priority" version="-1" />
    <use id="f0094c7d-7df0-4fa9-9be7-4ba73a8db962" name="org.iets3.table.coolingbehaviortable" version="-1" />
    <use id="8ca79d43-eb45-4791-bdd4-0d6130ff895b" name="de.itemis.mps.editor.diagram.layout" version="-1" />
  </languages>
  <imports>
    <import index="plfp" ref="r:82415404-e5c7-47c8-ae5b-951fc882e316(org.iets3.req.core.structure)" />
    <import index="oehh" ref="r:0e362b8d-d9a6-45f0-9d73-14f8c7b5dfd0(org.iets3.process.modelproperty.structure)" />
    <import index="plfp" ref="r:82415404-e5c7-47c8-ae5b-951fc882e316(org.iets3.req.core.structure)" />
    <import index="plfp" ref="r:82415404-e5c7-47c8-ae5b-951fc882e316(org.iets3.req.core.structure)" />
    <import index="fivt" ref="r:4cfd5e11-f7f0-4e58-82bd-8b7f0a30d46f(org.iets3.table.coolingbehaviortable.structure)" />
    <import index="2c95" ref="r:5f7188a9-e7b4-4a2e-bef9-38d2cf379fdc(com.mbeddr.doc.structure)" />
    <import index="tuf9" ref="r:7f8b53fb-2dfc-4e51-940a-0573ffa4389c(org.iets3.glossary.structure)" />
    <import index="8s0y" ref="r:50155ec7-8748-4b4a-8104-8760a416840f(org.iets3.req.priority.structure)" />
    <import index="cayy" ref="r:c1f7e681-4373-4429-b23f-337a1dd93658(org.iets3.core.users.structure)" />
    <import index="fivt" ref="r:4cfd5e11-f7f0-4e58-82bd-8b7f0a30d46f(org.iets3.table.coolingbehaviortable.structure)" />
  </imports>
  <registry>
    <language id="c020a239-d865-4312-adc3-cb4ab0a7a547" name="org.iets3.process.modelproperty.formulae">
      <concept id="4439542802417923302" name="org.iets3.process.modelproperty.formulae.structure.NotPropertyFormula" flags="ng" index="aRPxe" />
      <concept id="4439542802417923288" name="org.iets3.process.modelproperty.formulae.structure.UnaryPropertyFormula" flags="ng" index="aRPxK">
        <child id="2829711462938969999" name="arg" index="1y4i0q" />
      </concept>
      <concept id="4439542802417923291" name="org.iets3.process.modelproperty.formulae.structure.AndPropertyFormula" flags="ng" index="aRPxN" />
      <concept id="4439542802417923285" name="org.iets3.process.modelproperty.formulae.structure.BinaryPropertyFormula" flags="ng" index="aRPxX">
        <child id="2829711462938969990" name="arg1" index="1y4i0j" />
        <child id="2829711462938969996" name="arg2" index="1y4i0p" />
      </concept>
      <concept id="7571185389806664458" name="org.iets3.process.modelproperty.formulae.structure.AtomicProperty" flags="ng" index="3x7ZJP">
        <child id="3369881559473997964" name="property" index="2DkB7w" />
      </concept>
    </language>
    <language id="92d2ea16-5a42-4fdf-a676-c7604efe3504" name="de.slisson.mps.richtext">
      <concept id="2557074442922380897" name="de.slisson.mps.richtext.structure.Text" flags="ng" index="19SGf9">
        <child id="2557074442922392302" name="words" index="19SJt6" />
      </concept>
      <concept id="2557074442922438156" name="de.slisson.mps.richtext.structure.Word" flags="ng" index="19SUe$" />
    </language>
    <language id="2374bc90-7e37-41f1-a9c4-c2e35194c36a" name="com.mbeddr.doc">
      <concept id="6657644269295214799" name="com.mbeddr.doc.structure.IDocumentLike" flags="ng" index="G9hjZ">
        <reference id="6657644269295214800" name="config" index="G9hjw" />
      </concept>
      <concept id="6386504476136472795" name="com.mbeddr.doc.structure.PathDefinition" flags="ng" index="2SbYGw">
        <child id="2642765975824057986" name="pathPicker" index="9PVG_" />
      </concept>
      <concept id="6386504476136472782" name="com.mbeddr.doc.structure.DocumentConfig" flags="ng" index="2SbYGP">
        <child id="5785245534401182264" name="defaultTempPath" index="Cbewh" />
      </concept>
      <concept id="3350625596580089586" name="com.mbeddr.doc.structure.TextParagraph" flags="ng" index="1_0LV8">
        <child id="3350625596580089613" name="text" index="1_0LWR" />
      </concept>
      <concept id="3350625596580064249" name="com.mbeddr.doc.structure.IDocContentContainer" flags="ng" index="1_0VJ3">
        <child id="3350625596580064250" name="contents" index="1_0VJ0" />
      </concept>
    </language>
    <language id="f0094c7d-7df0-4fa9-9be7-4ba73a8db962" name="org.iets3.table.coolingbehaviortable">
      <concept id="9177268329656752708" name="org.iets3.table.coolingbehaviortable.structure.DecreasingThreshold" flags="ng" index="1iZyUC">
        <property id="9177268329656752713" name="Max" index="1iZyU_" />
        <property id="9177268329656752711" name="Min" index="1iZyUF" />
      </concept>
      <concept id="9177268329656752693" name="org.iets3.table.coolingbehaviortable.structure.IncreasingThreshold" flags="ng" index="1iZyVp">
        <property id="9177268329656752696" name="Min" index="1iZyVk" />
        <property id="9177268329656752698" name="Max" index="1iZyVm" />
      </concept>
      <concept id="7430885610120754429" name="org.iets3.table.coolingbehaviortable.structure.DutyCycleVal" flags="ng" index="3yOfJE">
        <property id="7430885610120756720" name="dutyCycle" index="3yOfbB" />
      </concept>
      <concept id="7430885610120728418" name="org.iets3.table.coolingbehaviortable.structure.CoolingBehaviorRow" flags="ng" index="3yOg1P">
        <child id="7430885610120754432" name="MWPValue" index="3yOfCn" />
        <child id="7430885610120753382" name="DecreasingInterval" index="3yOfZL" />
        <child id="7430885610120753380" name="IncreasingInterval" index="3yOfZN" />
      </concept>
      <concept id="7430885610120727933" name="org.iets3.table.coolingbehaviortable.structure.CoolingBehaviorTable" flags="ng" index="3yOg9E">
        <child id="9177268329656878919" name="decreasingThreshold" index="1iY3eF" />
        <child id="9177268329656878915" name="increasingThreshold" index="1iY3eJ" />
        <child id="7430885610120958225" name="drow" index="3yNpS6" />
      </concept>
      <concept id="7430885610120730869" name="org.iets3.table.coolingbehaviortable.structure.DecreasingValue" flags="ng" index="3yOhvy">
        <property id="3665318202133670269" name="To" index="0bFC1" />
        <property id="3665318202133670271" name="From" index="0bFC3" />
      </concept>
      <concept id="7430885610120730866" name="org.iets3.table.coolingbehaviortable.structure.IncreasingValue" flags="ng" index="3yOhv_">
        <property id="3665318202133670276" name="From" index="0bFFS" />
        <property id="3665318202133670274" name="To" index="0bFFY" />
      </concept>
    </language>
    <language id="10211132-9b5e-427a-9b37-1c1f28794a5e" name="org.iets3.process.dashboard">
      <concept id="8297182490505183264" name="org.iets3.process.dashboard.structure.StatePointer" flags="ng" index="2O0Cez">
        <reference id="8297182490505183265" name="nextStatePointer" index="2O0Cey" />
        <reference id="912111804093288680" name="previousStatePointer" index="1yKUwM" />
      </concept>
      <concept id="4278269416858278656" name="org.iets3.process.dashboard.structure.FlowData" flags="ng" index="Q7yLu">
        <child id="5996302761781590093" name="stateList" index="32A5Rq" />
      </concept>
      <concept id="2376827924916268618" name="org.iets3.process.dashboard.structure.DashboardHintDisplayer" flags="ng" index="2W8dSH">
        <child id="8062167295355084224" name="dataFlowChild" index="3KyWYK" />
      </concept>
      <concept id="5996302761781590116" name="org.iets3.process.dashboard.structure.NodePointer" flags="ng" index="32A5RN">
        <reference id="5996302761781590117" name="pointer" index="32A5RM" />
      </concept>
      <concept id="5996302761781372254" name="org.iets3.process.dashboard.structure.State" flags="ng" index="32AK39">
        <property id="8297182490505019797" name="isStart" index="2O0g8m" />
        <property id="8297182490512160219" name="mode" index="2OHfpo" />
        <property id="8297182490513022918" name="isFinal" index="2OILL5" />
        <property id="5996302761781590101" name="text" index="32A5R2" />
        <child id="8297182490505663428" name="nextStates" index="2O2X17" />
        <child id="8297182490510779274" name="previousStates" index="2Omu09" />
        <child id="5996302761781590103" name="formula" index="32A5R0" />
        <child id="5996302761781590119" name="listOfPointer" index="32A5RK" />
      </concept>
    </language>
    <language id="e8ac6d12-64b2-4478-bf9a-80cbf4ec8c16" name="org.iets3.process.core">
      <concept id="1235726657816259832" name="org.iets3.process.core.structure.NodeCreationProperty" flags="ng" index="fI48x">
        <reference id="1235726657816438061" name="conceptToBeCreated" index="fxKJO" />
      </concept>
      <concept id="4833124655349364588" name="org.iets3.process.core.structure.InformationString" flags="ng" index="ulk8C">
        <property id="1235726657816716306" name="text" index="fwOFb" />
      </concept>
      <concept id="4833124655349364971" name="org.iets3.process.core.structure.FlowState" flags="ng" index="ulkQJ">
        <property id="8297182490504976684" name="startState" index="2O1_EJ" />
        <child id="1235726657816259827" name="listOfNewNodes" index="fI48E" />
        <child id="4833124655349364974" name="displayString" index="ulkQE" />
        <child id="4833124655349426470" name="propertyFormula" index="um_Ly" />
        <child id="8297182490504813713" name="nextStates" index="2O1dWi" />
      </concept>
      <concept id="4833124655349364979" name="org.iets3.process.core.structure.FlowChunk" flags="ng" index="ulkQR">
        <child id="4833124655349364980" name="stateInstances" index="ulkQK" />
        <child id="3369881559473720185" name="targetDashboardLanguage" index="2Dlz8l" />
      </concept>
      <concept id="8297182490504813707" name="org.iets3.process.core.structure.FlowStatePointer" flags="ng" index="2O1dW8">
        <reference id="8297182490504813708" name="flowStatePointer" index="2O1dWf" />
      </concept>
    </language>
    <language id="d3a0fd26-445a-466c-900e-10444ddfed52" name="com.mbeddr.mpsutil.filepicker">
      <concept id="2642765975824060179" name="com.mbeddr.mpsutil.filepicker.structure.SolutionRelativeDirPicker" flags="ng" index="9PVaO" />
      <concept id="6156524541422549000" name="com.mbeddr.mpsutil.filepicker.structure.AbstractPicker" flags="ng" index="3N1QpV">
        <property id="9294901202237533" name="mayBeEmpty" index="3kgbRO" />
        <property id="2711621784026951428" name="pointOnlyToExistingFile" index="1RwFax" />
      </concept>
    </language>
    <language id="f95247f1-a285-4e98-864f-7f4b1723a807" name="org.iets3.core.users">
      <concept id="8479184967780604356" name="org.iets3.core.users.structure.User" flags="ng" index="30Mgg9">
        <property id="8479184967780604364" name="email" index="30Mgg1" />
        <property id="8479184967780604361" name="lastName" index="30Mgg4" />
        <property id="8479184967780604359" name="firstName" index="30Mgga" />
      </concept>
      <concept id="8479184967780604478" name="org.iets3.core.users.structure.UserDirectory" flags="ng" index="30MgvN">
        <child id="8479184967780604481" name="users" index="30Mguc" />
      </concept>
      <concept id="8479184967780770791" name="org.iets3.core.users.structure.UserRef" flags="ng" index="30MVSE">
        <reference id="8479184967780770792" name="user" index="30MVS_" />
      </concept>
    </language>
    <language id="7866978e-a0f0-4cc7-81bc-4d213d9375e1" name="jetbrains.mps.lang.smodel">
      <concept id="4497478346159780083" name="jetbrains.mps.lang.smodel.structure.LanguageRefExpression" flags="ng" index="pHN19">
        <child id="3542851458883491298" name="languageId" index="2V$M_3" />
      </concept>
      <concept id="3542851458883438784" name="jetbrains.mps.lang.smodel.structure.LanguageId" flags="ng" index="2V$Bhx">
        <property id="3542851458883439831" name="namespace" index="2V$B1Q" />
        <property id="3542851458883439832" name="languageId" index="2V$B1T" />
      </concept>
      <concept id="2644386474300074836" name="jetbrains.mps.lang.smodel.structure.ConceptIdRefExpression" flags="nn" index="35c_gC">
        <reference id="2644386474300074837" name="conceptDeclaration" index="35c_gD" />
      </concept>
    </language>
    <language id="ceab5195-25ea-4f22-9b92-103b95ca8c0c" name="jetbrains.mps.lang.core">
      <concept id="1169194658468" name="jetbrains.mps.lang.core.structure.INamedConcept" flags="ng" index="TrEIO">
        <property id="1169194664001" name="name" index="TrG5h" />
      </concept>
    </language>
    <language id="8e4e17de-bc10-4a34-a376-a243fbde540e" name="org.iets3.glossary">
      <concept id="7551038907536168764" name="org.iets3.glossary.structure.TermRefWord" flags="ng" index="1K4BFt">
        <reference id="7551038907536168770" name="term" index="1K4BEz" />
      </concept>
      <concept id="7551038907536067159" name="org.iets3.glossary.structure.GlossaryTerm" flags="ng" index="1K7uuQ">
        <child id="7551038907536074458" name="doc" index="1K7sGV" />
      </concept>
      <concept id="7551038907536067158" name="org.iets3.glossary.structure.GlossaryChunk" flags="ng" index="1K7uuR">
        <child id="7551038907536067160" name="terms" index="1K7uuT" />
      </concept>
      <concept id="7551038907536072626" name="org.iets3.glossary.structure.GlossaryDocSection" flags="ng" index="1K7v9j" />
    </language>
    <language id="a3c6f642-41b7-44cb-951b-463b8427a245" name="org.iets3.req.core">
      <concept id="380060842849065675" name="org.iets3.req.core.structure.StateNew" flags="ng" index="2IiYmp" />
      <concept id="8479184967782930103" name="org.iets3.req.core.structure.CCTag" flags="ng" index="3098HU">
        <child id="8479184967782930104" name="users" index="3098HP" />
      </concept>
      <concept id="8913201067422874021" name="org.iets3.req.core.structure.NonMergeableWord" flags="ng" index="3KVni0">
        <property id="8913201067422962862" name="escapedValue" index="3KOHAb" />
      </concept>
      <concept id="4230179762005235942" name="org.iets3.req.core.structure.HeaderRequirement" flags="ng" index="3SUGrM" />
      <concept id="5151426049053646109" name="org.iets3.req.core.structure.KindFunctional" flags="ng" index="3VXduJ" />
      <concept id="5151426049053572067" name="org.iets3.req.core.structure.RequirementsDocSection" flags="ng" index="3VXr5h" />
      <concept id="5151426049053542735" name="org.iets3.req.core.structure.IReqContainer" flags="ng" index="3VY$fX">
        <child id="5151426049053542821" name="requirements" index="3VY$cn" />
      </concept>
      <concept id="5151426049053136028" name="org.iets3.req.core.structure.RequirementsChunk" flags="ng" index="3VZ1SI" />
      <concept id="5151426049053136313" name="org.iets3.req.core.structure.DefaultRequirement" flags="ng" index="3VZ1Wb">
        <child id="380060842849066491" name="state" index="2IiYaD" />
        <child id="8479184967780780683" name="owner" index="30MXt6" />
        <child id="5151426049053645603" name="tags" index="3VXd6h" />
        <child id="5151426049053645598" name="kind" index="3VXd6G" />
        <child id="5151426049053572064" name="doc" index="3VXr5i" />
      </concept>
      <concept id="5151426049053136302" name="org.iets3.req.core.structure.AbstractRequirement" flags="ng" index="3VZ1Ws">
        <property id="816340308089533389" name="uniqueID" index="1kP$Fy" />
        <property id="5151426049053136371" name="title" index="3VZ1X1" />
      </concept>
    </language>
  </registry>
  <node concept="ulkQR" id="4ciHkhtidcc">
    <property role="TrG5h" value="Cooling Controller Requirements" />
    <node concept="ulkQJ" id="38QI5jjP83F" role="ulkQK">
      <property role="TrG5h" value="Empty requirements project" />
      <property role="2O1_EJ" value="true" />
      <node concept="2O1dW8" id="7c_wSf78Tv1" role="2O1dWi">
        <ref role="2O1dWf" node="23Wc6ut1Xkv" resolve="Empty requirement model and no glossary terms defined" />
      </node>
      <node concept="fI48x" id="4Wfjtx1_kus" role="fI48E">
        <ref role="fxKJO" to="plfp:4tXyFaWwpis" resolve="RequirementsChunk" />
      </node>
      <node concept="fI48x" id="6mLEnnu$vCC" role="fI48E">
        <ref role="fxKJO" to="2c95:5yxqZJwzC3e" resolve="DocumentConfig" />
      </node>
      <node concept="fI48x" id="7tAIZp0gxc6" role="fI48E">
        <ref role="fxKJO" to="tuf9:6zaFu4oPODm" resolve="GlossaryChunk" />
      </node>
      <node concept="fI48x" id="7tAIZp0mqbB" role="fI48E">
        <ref role="fxKJO" to="cayy:7mG7sQPphCY" resolve="UserDirectory" />
      </node>
      <node concept="ulk8C" id="38QI5jjPaAL" role="ulkQE">
        <property role="fwOFb" value="Create new requirements project" />
      </node>
      <node concept="aRPxe" id="6nILHkGZTsX" role="um_Ly">
        <node concept="3x7ZJP" id="7tAIZp0sdcM" role="1y4i0q">
          <ref role="35c_gD" to="oehh:7tAIZp0bkmp" resolve="ProjectIsCreatedProperty" />
          <node concept="35c_gC" id="7tAIZp0sdcO" role="2DkB7w">
            <ref role="35c_gD" to="oehh:7tAIZp0bkmp" resolve="ProjectIsCreatedProperty" />
          </node>
        </node>
      </node>
    </node>
    <node concept="ulkQJ" id="23Wc6ut1Xkv" role="ulkQK">
      <property role="TrG5h" value="Empty requirement model and no glossary terms defined" />
      <node concept="2O1dW8" id="7c_wSf78Tv3" role="2O1dWi">
        <ref role="2O1dWf" node="6mLEnnuDUFU" resolve="Requirements model complete and glossary terms not defined" />
      </node>
      <node concept="2O1dW8" id="7c_wSf78Tv8" role="2O1dWi">
        <ref role="2O1dWf" node="4mvkNAhF8uM" resolve="Requirements model not complete and glossary terms defined" />
      </node>
      <node concept="ulk8C" id="23Wc6ut1Xkw" role="ulkQE">
        <property role="fwOFb" value="Please add a requirement for the cooling system where you define the temperature thresholds as glossary terms" />
      </node>
      <node concept="aRPxN" id="6nILHkGZT_8" role="um_Ly">
        <node concept="3x7ZJP" id="6nILHkGZTA1" role="1y4i0j">
          <ref role="35c_gD" to="oehh:7tAIZp0bkmp" resolve="ProjectIsCreatedProperty" />
          <node concept="35c_gC" id="6nILHkGZTA3" role="2DkB7w">
            <ref role="35c_gD" to="oehh:7tAIZp0bkmp" resolve="ProjectIsCreatedProperty" />
          </node>
        </node>
        <node concept="aRPxN" id="7tAIZp0e7z1" role="1y4i0p">
          <node concept="aRPxe" id="7tAIZp0e7zC" role="1y4i0p">
            <node concept="3x7ZJP" id="7tAIZp0gKD_" role="1y4i0q">
              <ref role="35c_gD" to="oehh:38QI5jjR3Qm" resolve="GlossaryTermDefinedProperty" />
              <node concept="35c_gC" id="7tAIZp0gKDB" role="2DkB7w">
                <ref role="35c_gD" to="oehh:38QI5jjR3Qm" resolve="GlossaryTermDefinedProperty" />
              </node>
            </node>
          </node>
          <node concept="aRPxe" id="7tAIZp0nDeV" role="1y4i0j">
            <node concept="3x7ZJP" id="7tAIZp0nDf0" role="1y4i0q">
              <ref role="35c_gD" to="oehh:23Wc6usRcwc" resolve="RequirementsErrorFreeProperty" />
              <node concept="35c_gC" id="7tAIZp0nDf2" role="2DkB7w">
                <ref role="35c_gD" to="oehh:23Wc6usRcwc" resolve="RequirementsErrorFreeProperty" />
              </node>
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="ulkQJ" id="6mLEnnuDUFU" role="ulkQK">
      <property role="TrG5h" value="Requirements model complete and glossary terms not defined" />
      <node concept="2O1dW8" id="7c_wSf78Tvc" role="2O1dWi">
        <ref role="2O1dWf" node="7tAIZp0e7$v" resolve="Requirements model complete and glossary terms defined" />
      </node>
      <node concept="ulk8C" id="6mLEnnuDUFV" role="ulkQE">
        <property role="fwOFb" value="Please define the glossary terms" />
      </node>
      <node concept="aRPxN" id="4mvkNAhGCaf" role="um_Ly">
        <node concept="3x7ZJP" id="4mvkNAhGCay" role="1y4i0j">
          <ref role="35c_gD" to="oehh:23Wc6usRcwc" resolve="RequirementsErrorFreeProperty" />
          <node concept="35c_gC" id="4mvkNAhGCa$" role="2DkB7w">
            <ref role="35c_gD" to="oehh:23Wc6usRcwc" resolve="RequirementsErrorFreeProperty" />
          </node>
        </node>
        <node concept="aRPxe" id="7tAIZp0e7_3" role="1y4i0p">
          <node concept="3x7ZJP" id="4mvkNAhGCbc" role="1y4i0q">
            <ref role="35c_gD" to="oehh:38QI5jjR3Qm" resolve="GlossaryTermDefinedProperty" />
            <node concept="35c_gC" id="4mvkNAhGCbe" role="2DkB7w">
              <ref role="35c_gD" to="oehh:38QI5jjR3Qm" resolve="GlossaryTermDefinedProperty" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="ulkQJ" id="4mvkNAhF8uM" role="ulkQK">
      <property role="TrG5h" value="Requirements model not complete and glossary terms defined" />
      <node concept="2O1dW8" id="7c_wSf78Tve" role="2O1dWi">
        <ref role="2O1dWf" node="7tAIZp0e7$v" resolve="Requirements model complete and glossary terms defined" />
      </node>
      <node concept="ulk8C" id="4mvkNAhF8uN" role="ulkQE">
        <property role="fwOFb" value="Please complete the missing information in the requirements" />
      </node>
      <node concept="aRPxN" id="4mvkNAhF8vi" role="um_Ly">
        <node concept="3x7ZJP" id="4mvkNAhF8vX" role="1y4i0p">
          <ref role="35c_gD" to="oehh:38QI5jjR3Qm" resolve="GlossaryTermDefinedProperty" />
          <node concept="35c_gC" id="4mvkNAhF8vZ" role="2DkB7w">
            <ref role="35c_gD" to="oehh:38QI5jjR3Qm" resolve="GlossaryTermDefinedProperty" />
          </node>
        </node>
        <node concept="aRPxe" id="7tAIZp0e7$8" role="1y4i0j">
          <node concept="3x7ZJP" id="7tAIZp0gKDT" role="1y4i0q">
            <ref role="35c_gD" to="oehh:23Wc6usRcwc" resolve="RequirementsErrorFreeProperty" />
            <node concept="35c_gC" id="7tAIZp0gKDV" role="2DkB7w">
              <ref role="35c_gD" to="oehh:23Wc6usRcwc" resolve="RequirementsErrorFreeProperty" />
            </node>
          </node>
        </node>
      </node>
    </node>
    <node concept="ulkQJ" id="7tAIZp0e7$v" role="ulkQK">
      <property role="TrG5h" value="Requirements model complete and glossary terms defined" />
      <node concept="2O1dW8" id="7c_wSf78Tvg" role="2O1dWi">
        <ref role="2O1dWf" node="7tAIZp0e7_V" resolve="Empty functional behavior with Min and Max thresholds set" />
      </node>
      <node concept="ulk8C" id="7tAIZp0e7$w" role="ulkQE">
        <property role="fwOFb" value="Create the controller's functional behavior as a table" />
      </node>
      <node concept="aRPxN" id="7tAIZp0x_4s" role="um_Ly">
        <node concept="3x7ZJP" id="7tAIZp0x_4E" role="1y4i0j">
          <ref role="35c_gD" to="oehh:23Wc6usRcwc" resolve="RequirementsErrorFreeProperty" />
          <node concept="35c_gC" id="7tAIZp0x_4G" role="2DkB7w">
            <ref role="35c_gD" to="oehh:23Wc6usRcwc" resolve="RequirementsErrorFreeProperty" />
          </node>
        </node>
        <node concept="3x7ZJP" id="7tAIZp0x_5a" role="1y4i0p">
          <ref role="35c_gD" to="oehh:38QI5jjR3Qm" resolve="GlossaryTermDefinedProperty" />
          <node concept="35c_gC" id="7tAIZp0x_5c" role="2DkB7w">
            <ref role="35c_gD" to="oehh:38QI5jjR3Qm" resolve="GlossaryTermDefinedProperty" />
          </node>
        </node>
      </node>
      <node concept="fI48x" id="3T5sQlfdis4" role="fI48E">
        <ref role="fxKJO" to="fivt:6svNLu5NGPX" resolve="CoolingBehaviorTable" />
      </node>
    </node>
    <node concept="ulkQJ" id="7tAIZp0e7_V" role="ulkQK">
      <property role="TrG5h" value="Empty functional behavior with Min and Max thresholds set" />
      <node concept="2O1dW8" id="7c_wSf78Tvi" role="2O1dWi">
        <ref role="2O1dWf" node="7tAIZp0e7Bp" resolve="Controller behavior complete" />
      </node>
      <node concept="ulk8C" id="7tAIZp0e7_W" role="ulkQE">
        <property role="fwOFb" value="Please complete the controller's functional behavior" />
      </node>
      <node concept="aRPxN" id="3u_4CrCHFbq" role="um_Ly">
        <node concept="aRPxe" id="3u_4CrCHFcS" role="1y4i0p">
          <node concept="3x7ZJP" id="3u_4CrCHFd_" role="1y4i0q">
            <ref role="35c_gD" to="oehh:7tAIZp0cVX0" resolve="ErrorFreeTableProperty" />
            <node concept="35c_gC" id="3u_4CrCHFdB" role="2DkB7w">
              <ref role="35c_gD" to="oehh:7tAIZp0cVX0" resolve="ErrorFreeTableProperty" />
            </node>
          </node>
        </node>
        <node concept="3x7ZJP" id="4gdbHZQNn1H" role="1y4i0j">
          <ref role="35c_gD" to="oehh:7tAIZp0bKOf" resolve="EmptyTableProperty" />
          <node concept="35c_gC" id="4gdbHZQNn1J" role="2DkB7w">
            <ref role="35c_gD" to="oehh:7tAIZp0bKOf" resolve="EmptyTableProperty" />
          </node>
        </node>
      </node>
    </node>
    <node concept="ulkQJ" id="7tAIZp0e7Bp" role="ulkQK">
      <property role="TrG5h" value="Controller behavior complete" />
      <node concept="ulk8C" id="7tAIZp0e7Bq" role="ulkQE">
        <property role="fwOFb" value="The controller's behavior is now complete" />
      </node>
      <node concept="3x7ZJP" id="4gdbHZQNofg" role="um_Ly">
        <ref role="35c_gD" to="oehh:7tAIZp0cVX0" resolve="ErrorFreeTableProperty" />
        <node concept="35c_gC" id="4gdbHZQNofh" role="2DkB7w">
          <ref role="35c_gD" to="oehh:7tAIZp0cVX0" resolve="ErrorFreeTableProperty" />
        </node>
      </node>
    </node>
    <node concept="pHN19" id="2V4emM7$EFE" role="2Dlz8l">
      <node concept="2V$Bhx" id="2nJapj3pVyU" role="2V$M_3">
        <property role="2V$B1T" value="10211132-9b5e-427a-9b37-1c1f28794a5e" />
        <property role="2V$B1Q" value="org.iets3.flow.dashboard" />
      </node>
    </node>
  </node>
  <node concept="2W8dSH" id="7rbhb$V_KjQ">
    <node concept="Q7yLu" id="7rbhb$VA60s" role="3KyWYK">
      <property role="TrG5h" value="FlowDataRootNode" />
      <node concept="32AK39" id="7rbhb$VA60t" role="32A5Rq">
        <property role="TrG5h" value="Empty requirements project" />
        <property role="32A5R2" value="Create new requirements project" />
        <property role="2O0g8m" value="true" />
        <property role="2OILL5" value="false" />
        <property role="2OHfpo" value="0" />
        <node concept="aRPxe" id="7rbhb$VA60u" role="32A5R0">
          <node concept="3x7ZJP" id="7rbhb$VA60v" role="1y4i0q">
            <ref role="35c_gD" to="oehh:7tAIZp0bkmp" resolve="ProjectIsCreatedProperty" />
            <node concept="35c_gC" id="7rbhb$VA60w" role="2DkB7w">
              <ref role="35c_gD" to="oehh:7tAIZp0bkmp" resolve="ProjectIsCreatedProperty" />
            </node>
          </node>
        </node>
        <node concept="32A5RN" id="7rbhb$VA60x" role="32A5RK">
          <ref role="32A5RM" to="plfp:4tXyFaWwpis" resolve="RequirementsChunk" />
        </node>
        <node concept="32A5RN" id="7rbhb$VA60y" role="32A5RK">
          <ref role="32A5RM" to="2c95:5yxqZJwzC3e" resolve="DocumentConfig" />
        </node>
        <node concept="32A5RN" id="7rbhb$VA60z" role="32A5RK">
          <ref role="32A5RM" to="tuf9:6zaFu4oPODm" resolve="GlossaryChunk" />
        </node>
        <node concept="32A5RN" id="7rbhb$VA60$" role="32A5RK">
          <ref role="32A5RM" to="cayy:7mG7sQPphCY" resolve="UserDirectory" />
        </node>
        <node concept="2O0Cez" id="7rbhb$VA60_" role="2O2X17">
          <ref role="2O0Cey" node="7rbhb$VA60A" resolve="Empty requirement model and no glossary terms defined" />
          <ref role="1yKUwM" node="7rbhb$VA60t" resolve="Empty requirements project" />
        </node>
      </node>
      <node concept="32AK39" id="7rbhb$VA60A" role="32A5Rq">
        <property role="TrG5h" value="Empty requirement model and no glossary terms defined" />
        <property role="32A5R2" value="Please add a requirement for the cooling system where you define the temperature thresholds as glossary terms" />
        <property role="2O0g8m" value="false" />
        <property role="2OILL5" value="false" />
        <property role="2OHfpo" value="0" />
        <node concept="aRPxN" id="7rbhb$VA60B" role="32A5R0">
          <node concept="3x7ZJP" id="7rbhb$VA60C" role="1y4i0j">
            <ref role="35c_gD" to="oehh:7tAIZp0bkmp" resolve="ProjectIsCreatedProperty" />
            <node concept="35c_gC" id="7rbhb$VA60D" role="2DkB7w">
              <ref role="35c_gD" to="oehh:7tAIZp0bkmp" resolve="ProjectIsCreatedProperty" />
            </node>
          </node>
          <node concept="aRPxN" id="7rbhb$VA60E" role="1y4i0p">
            <node concept="aRPxe" id="7rbhb$VA60F" role="1y4i0p">
              <node concept="3x7ZJP" id="7rbhb$VA60G" role="1y4i0q">
                <ref role="35c_gD" to="oehh:38QI5jjR3Qm" resolve="GlossaryTermDefinedProperty" />
                <node concept="35c_gC" id="7rbhb$VA60H" role="2DkB7w">
                  <ref role="35c_gD" to="oehh:38QI5jjR3Qm" resolve="GlossaryTermDefinedProperty" />
                </node>
              </node>
            </node>
            <node concept="aRPxe" id="7rbhb$VA60I" role="1y4i0j">
              <node concept="3x7ZJP" id="7rbhb$VA60J" role="1y4i0q">
                <ref role="35c_gD" to="oehh:23Wc6usRcwc" resolve="RequirementsErrorFreeProperty" />
                <node concept="35c_gC" id="7rbhb$VA60K" role="2DkB7w">
                  <ref role="35c_gD" to="oehh:23Wc6usRcwc" resolve="RequirementsErrorFreeProperty" />
                </node>
              </node>
            </node>
          </node>
        </node>
        <node concept="2O0Cez" id="7rbhb$VA60L" role="2Omu09">
          <ref role="2O0Cey" node="7rbhb$VA60t" resolve="Empty requirements project" />
        </node>
        <node concept="2O0Cez" id="7rbhb$VA60M" role="2O2X17">
          <ref role="2O0Cey" node="7rbhb$VA60O" resolve="Requirements model complete and glossary terms not defined" />
          <ref role="1yKUwM" node="7rbhb$VA60A" resolve="Empty requirement model and no glossary terms defined" />
        </node>
        <node concept="2O0Cez" id="7rbhb$VA60N" role="2O2X17">
          <ref role="2O0Cey" node="7rbhb$VA60X" resolve="Requirements model not complete and glossary terms defined" />
          <ref role="1yKUwM" node="7rbhb$VA60A" resolve="Empty requirement model and no glossary terms defined" />
        </node>
      </node>
      <node concept="32AK39" id="7rbhb$VA60O" role="32A5Rq">
        <property role="TrG5h" value="Requirements model complete and glossary terms not defined" />
        <property role="32A5R2" value="Please define the glossary terms" />
        <property role="2O0g8m" value="false" />
        <property role="2OILL5" value="false" />
        <property role="2OHfpo" value="0" />
        <node concept="aRPxN" id="7rbhb$VA60P" role="32A5R0">
          <node concept="3x7ZJP" id="7rbhb$VA60Q" role="1y4i0j">
            <ref role="35c_gD" to="oehh:23Wc6usRcwc" resolve="RequirementsErrorFreeProperty" />
            <node concept="35c_gC" id="7rbhb$VA60R" role="2DkB7w">
              <ref role="35c_gD" to="oehh:23Wc6usRcwc" resolve="RequirementsErrorFreeProperty" />
            </node>
          </node>
          <node concept="aRPxe" id="7rbhb$VA60S" role="1y4i0p">
            <node concept="3x7ZJP" id="7rbhb$VA60T" role="1y4i0q">
              <ref role="35c_gD" to="oehh:38QI5jjR3Qm" resolve="GlossaryTermDefinedProperty" />
              <node concept="35c_gC" id="7rbhb$VA60U" role="2DkB7w">
                <ref role="35c_gD" to="oehh:38QI5jjR3Qm" resolve="GlossaryTermDefinedProperty" />
              </node>
            </node>
          </node>
        </node>
        <node concept="2O0Cez" id="7rbhb$VA60V" role="2Omu09">
          <ref role="2O0Cey" node="7rbhb$VA60A" resolve="Empty requirement model and no glossary terms defined" />
        </node>
        <node concept="2O0Cez" id="7rbhb$VA60W" role="2O2X17">
          <ref role="2O0Cey" node="7rbhb$VA616" resolve="Requirements model complete and glossary terms defined" />
          <ref role="1yKUwM" node="7rbhb$VA60O" resolve="Requirements model complete and glossary terms not defined" />
        </node>
      </node>
      <node concept="32AK39" id="7rbhb$VA60X" role="32A5Rq">
        <property role="TrG5h" value="Requirements model not complete and glossary terms defined" />
        <property role="32A5R2" value="Please complete the missing information in the requirements" />
        <property role="2O0g8m" value="false" />
        <property role="2OILL5" value="false" />
        <property role="2OHfpo" value="0" />
        <node concept="aRPxN" id="7rbhb$VA60Y" role="32A5R0">
          <node concept="3x7ZJP" id="7rbhb$VA60Z" role="1y4i0p">
            <ref role="35c_gD" to="oehh:38QI5jjR3Qm" resolve="GlossaryTermDefinedProperty" />
            <node concept="35c_gC" id="7rbhb$VA610" role="2DkB7w">
              <ref role="35c_gD" to="oehh:38QI5jjR3Qm" resolve="GlossaryTermDefinedProperty" />
            </node>
          </node>
          <node concept="aRPxe" id="7rbhb$VA611" role="1y4i0j">
            <node concept="3x7ZJP" id="7rbhb$VA612" role="1y4i0q">
              <ref role="35c_gD" to="oehh:23Wc6usRcwc" resolve="RequirementsErrorFreeProperty" />
              <node concept="35c_gC" id="7rbhb$VA613" role="2DkB7w">
                <ref role="35c_gD" to="oehh:23Wc6usRcwc" resolve="RequirementsErrorFreeProperty" />
              </node>
            </node>
          </node>
        </node>
        <node concept="2O0Cez" id="7rbhb$VA614" role="2Omu09">
          <ref role="2O0Cey" node="7rbhb$VA60A" resolve="Empty requirement model and no glossary terms defined" />
        </node>
        <node concept="2O0Cez" id="7rbhb$VA615" role="2O2X17">
          <ref role="2O0Cey" node="7rbhb$VA616" resolve="Requirements model complete and glossary terms defined" />
          <ref role="1yKUwM" node="7rbhb$VA60X" resolve="Requirements model not complete and glossary terms defined" />
        </node>
      </node>
      <node concept="32AK39" id="7rbhb$VA616" role="32A5Rq">
        <property role="TrG5h" value="Requirements model complete and glossary terms defined" />
        <property role="32A5R2" value="Create the controller's functional behavior as a table" />
        <property role="2O0g8m" value="false" />
        <property role="2OILL5" value="false" />
        <property role="2OHfpo" value="0" />
        <node concept="aRPxN" id="7rbhb$VA617" role="32A5R0">
          <node concept="3x7ZJP" id="7rbhb$VA618" role="1y4i0j">
            <ref role="35c_gD" to="oehh:23Wc6usRcwc" resolve="RequirementsErrorFreeProperty" />
            <node concept="35c_gC" id="7rbhb$VA619" role="2DkB7w">
              <ref role="35c_gD" to="oehh:23Wc6usRcwc" resolve="RequirementsErrorFreeProperty" />
            </node>
          </node>
          <node concept="3x7ZJP" id="7rbhb$VA61a" role="1y4i0p">
            <ref role="35c_gD" to="oehh:38QI5jjR3Qm" resolve="GlossaryTermDefinedProperty" />
            <node concept="35c_gC" id="7rbhb$VA61b" role="2DkB7w">
              <ref role="35c_gD" to="oehh:38QI5jjR3Qm" resolve="GlossaryTermDefinedProperty" />
            </node>
          </node>
        </node>
        <node concept="32A5RN" id="7rbhb$VA61c" role="32A5RK">
          <ref role="32A5RM" to="fivt:6svNLu5NGPX" resolve="CoolingBehaviorTable" />
        </node>
        <node concept="2O0Cez" id="7rbhb$VA61d" role="2Omu09">
          <ref role="2O0Cey" node="7rbhb$VA60O" resolve="Requirements model complete and glossary terms not defined" />
        </node>
        <node concept="2O0Cez" id="7rbhb$VA61e" role="2Omu09">
          <ref role="2O0Cey" node="7rbhb$VA60X" resolve="Requirements model not complete and glossary terms defined" />
        </node>
        <node concept="2O0Cez" id="7rbhb$VA61f" role="2O2X17">
          <ref role="2O0Cey" node="7rbhb$VA61g" resolve="Empty functional behavior with Min and Max thresholds set" />
          <ref role="1yKUwM" node="7rbhb$VA616" resolve="Requirements model complete and glossary terms defined" />
        </node>
      </node>
      <node concept="32AK39" id="7rbhb$VA61g" role="32A5Rq">
        <property role="TrG5h" value="Empty functional behavior with Min and Max thresholds set" />
        <property role="32A5R2" value="Please complete the controller's functional behavior" />
        <property role="2O0g8m" value="false" />
        <property role="2OILL5" value="false" />
        <property role="2OHfpo" value="0" />
        <node concept="aRPxN" id="7rbhb$VA61h" role="32A5R0">
          <node concept="aRPxe" id="7rbhb$VA61i" role="1y4i0p">
            <node concept="3x7ZJP" id="7rbhb$VA61j" role="1y4i0q">
              <ref role="35c_gD" to="oehh:7tAIZp0cVX0" resolve="ErrorFreeTableProperty" />
              <node concept="35c_gC" id="7rbhb$VA61k" role="2DkB7w">
                <ref role="35c_gD" to="oehh:7tAIZp0cVX0" resolve="ErrorFreeTableProperty" />
              </node>
            </node>
          </node>
          <node concept="3x7ZJP" id="7rbhb$VA61l" role="1y4i0j">
            <ref role="35c_gD" to="oehh:7tAIZp0bKOf" resolve="EmptyTableProperty" />
            <node concept="35c_gC" id="7rbhb$VA61m" role="2DkB7w">
              <ref role="35c_gD" to="oehh:7tAIZp0bKOf" resolve="EmptyTableProperty" />
            </node>
          </node>
        </node>
        <node concept="2O0Cez" id="7rbhb$VA61n" role="2Omu09">
          <ref role="2O0Cey" node="7rbhb$VA616" resolve="Requirements model complete and glossary terms defined" />
        </node>
        <node concept="2O0Cez" id="7rbhb$VA61o" role="2O2X17">
          <ref role="2O0Cey" node="7rbhb$VA61p" resolve="Controller behavior complete" />
          <ref role="1yKUwM" node="7rbhb$VA61g" resolve="Empty functional behavior with Min and Max thresholds set" />
        </node>
      </node>
      <node concept="32AK39" id="7rbhb$VA61p" role="32A5Rq">
        <property role="TrG5h" value="Controller behavior complete" />
        <property role="32A5R2" value="The controller's behavior is now complete" />
        <property role="2O0g8m" value="false" />
        <property role="2OILL5" value="true" />
        <property role="2OHfpo" value="1" />
        <node concept="3x7ZJP" id="7rbhb$VA61q" role="32A5R0">
          <ref role="35c_gD" to="oehh:7tAIZp0cVX0" resolve="ErrorFreeTableProperty" />
          <node concept="35c_gC" id="7rbhb$VA61r" role="2DkB7w">
            <ref role="35c_gD" to="oehh:7tAIZp0cVX0" resolve="ErrorFreeTableProperty" />
          </node>
        </node>
        <node concept="2O0Cez" id="7rbhb$VA61s" role="2Omu09">
          <ref role="2O0Cey" node="7rbhb$VA61g" resolve="Empty functional behavior with Min and Max thresholds set" />
        </node>
      </node>
    </node>
  </node>
  <node concept="3VZ1SI" id="7rbhb$V_KtQ">
    <property role="TrG5h" value="coolrequirements" />
    <ref role="G9hjw" node="7rbhb$V_KtR" resolve="cool" />
    <node concept="3SUGrM" id="7rbhb$VA4b7" role="3VY$cn">
      <property role="1kP$Fy" value="1" />
      <property role="TrG5h" value="req1" />
      <node concept="3VZ1Wb" id="7rbhb$VA4cl" role="3VY$cn">
        <property role="1kP$Fy" value="3" />
        <property role="3VZ1X1" value="controller1" />
        <property role="TrG5h" value="controller1" />
        <node concept="3VXduJ" id="7rbhb$VA4fL" role="3VXd6G" />
        <node concept="2IiYmp" id="7rbhb$VA4go" role="2IiYaD" />
        <node concept="3VXr5h" id="7rbhb$VA4cr" role="3VXr5i">
          <node concept="1_0LV8" id="7rbhb$VA4ib" role="1_0VJ0">
            <node concept="19SGf9" id="7rbhb$VA4ic" role="1_0LWR">
              <node concept="19SUe$" id="7rbhb$VA5iQ" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hg" role="19SJt6">
                <property role="3KOHAb" value="The" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5iR" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hh" role="19SJt6">
                <property role="3KOHAb" value="cooling" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5iS" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hi" role="19SJt6">
                <property role="3KOHAb" value="controller" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5iT" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hj" role="19SJt6">
                <property role="3KOHAb" value="shall" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5iU" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hk" role="19SJt6">
                <property role="3KOHAb" value="cool" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5iV" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hl" role="19SJt6">
                <property role="3KOHAb" value="down" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5iW" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hm" role="19SJt6">
                <property role="3KOHAb" value="the" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5iX" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hn" role="19SJt6">
                <property role="3KOHAb" value="hardware" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5iY" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5ho" role="19SJt6">
                <property role="3KOHAb" value="board" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5iZ" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hp" role="19SJt6">
                <property role="3KOHAb" value="by" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5j0" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hq" role="19SJt6">
                <property role="3KOHAb" value="adjusting" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5j1" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hr" role="19SJt6">
                <property role="3KOHAb" value="the" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5j2" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hs" role="19SJt6">
                <property role="3KOHAb" value="speed" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5j3" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5ht" role="19SJt6">
                <property role="3KOHAb" value="of" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5j4" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hu" role="19SJt6">
                <property role="3KOHAb" value="the" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5j5" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hv" role="19SJt6">
                <property role="3KOHAb" value="fan" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5j6" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hw" role="19SJt6">
                <property role="3KOHAb" value="to" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5j7" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hx" role="19SJt6">
                <property role="3KOHAb" value="an" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5j8" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hy" role="19SJt6">
                <property role="3KOHAb" value="appropriate" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5j9" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hz" role="19SJt6">
                <property role="3KOHAb" value="duty" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5ja" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5h$" role="19SJt6">
                <property role="3KOHAb" value="cycle." />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jb" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5h_" role="19SJt6">
                <property role="3KOHAb" value="The" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jc" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hA" role="19SJt6">
                <property role="3KOHAb" value="duty" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jd" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hB" role="19SJt6">
                <property role="3KOHAb" value="cycle" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5je" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hC" role="19SJt6">
                <property role="3KOHAb" value="depends" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jf" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hD" role="19SJt6">
                <property role="3KOHAb" value="on" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jg" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hE" role="19SJt6">
                <property role="3KOHAb" value="the" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jh" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hF" role="19SJt6">
                <property role="3KOHAb" value="current" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5ji" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hG" role="19SJt6">
                <property role="3KOHAb" value="temperature" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jj" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hH" role="19SJt6">
                <property role="3KOHAb" value="of" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jk" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hI" role="19SJt6">
                <property role="3KOHAb" value="the" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jl" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hJ" role="19SJt6">
                <property role="3KOHAb" value="hardware" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jm" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hK" role="19SJt6">
                <property role="3KOHAb" value="and" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jn" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hL" role="19SJt6">
                <property role="3KOHAb" value="whether" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jo" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hM" role="19SJt6">
                <property role="3KOHAb" value="that" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jp" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hN" role="19SJt6">
                <property role="3KOHAb" value="temperature" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jq" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hO" role="19SJt6">
                <property role="3KOHAb" value="is" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jr" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hP" role="19SJt6">
                <property role="3KOHAb" value="increasing" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5js" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hQ" role="19SJt6">
                <property role="3KOHAb" value="between" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jt" role="19SJt6" />
              <node concept="1K4BFt" id="7rbhb$VA5lU" role="19SJt6">
                <ref role="1K4BEz" node="7rbhb$VA5lP" resolve="minValueIncrease" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5ju" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hS" role="19SJt6">
                <property role="3KOHAb" value="and" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jv" role="19SJt6" />
              <node concept="1K4BFt" id="7rbhb$VA5og" role="19SJt6">
                <ref role="1K4BEz" node="7rbhb$VA5ob" resolve="maxValueIncrease" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jw" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hU" role="19SJt6">
                <property role="3KOHAb" value="," />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jx" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hV" role="19SJt6">
                <property role="3KOHAb" value="or" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jy" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hW" role="19SJt6">
                <property role="3KOHAb" value="decreasing" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jz" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hX" role="19SJt6">
                <property role="3KOHAb" value="between" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5j$" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5hY" role="19SJt6">
                <property role="3KOHAb" value="a" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5j_" role="19SJt6" />
              <node concept="1K4BFt" id="7rbhb$VA5qF" role="19SJt6">
                <ref role="1K4BEz" node="7rbhb$VA5qA" resolve="minValueDecrease" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jA" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5i0" role="19SJt6">
                <property role="3KOHAb" value="and" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jB" role="19SJt6" />
              <node concept="3KVni0" id="7rbhb$VA5i1" role="19SJt6">
                <property role="3KOHAb" value="a" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jC" role="19SJt6" />
              <node concept="1K4BFt" id="7rbhb$VA5tb" role="19SJt6">
                <ref role="1K4BEz" node="7rbhb$VA5t6" resolve="maxValueDecrease" />
              </node>
              <node concept="19SUe$" id="7rbhb$VA5jD" role="19SJt6" />
            </node>
          </node>
        </node>
        <node concept="30MVSE" id="7rbhb$VA4fa" role="30MXt6">
          <ref role="30MVS_" node="7rbhb$VA49T" resolve="abid1" />
        </node>
        <node concept="3098HU" id="7rbhb$VA4gZ" role="3VXd6h">
          <node concept="30MVSE" id="7rbhb$VA4h_" role="3098HP">
            <ref role="30MVS_" node="7rbhb$VA49T" resolve="abid1" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="2SbYGP" id="7rbhb$V_KtR">
    <property role="TrG5h" value="cool" />
    <node concept="2SbYGw" id="7rbhb$VA49f" role="Cbewh">
      <property role="TrG5h" value="coolconfig" />
      <node concept="9PVaO" id="7rbhb$VA49g" role="9PVG_">
        <property role="1RwFax" value="true" />
        <property role="3kgbRO" value="false" />
      </node>
    </node>
  </node>
  <node concept="1K7uuR" id="7rbhb$V_KtS">
    <property role="TrG5h" value="coolglossary" />
    <node concept="1K7uuQ" id="7rbhb$VA5lP" role="1K7uuT">
      <property role="TrG5h" value="minValueIncrease" />
      <node concept="1K7v9j" id="7rbhb$VA5lQ" role="1K7sGV">
        <node concept="1_0LV8" id="7rbhb$VA5lR" role="1_0VJ0">
          <node concept="19SGf9" id="7rbhb$VA5lS" role="1_0LWR">
            <node concept="19SUe$" id="7rbhb$VA5lT" role="19SJt6" />
          </node>
        </node>
      </node>
    </node>
    <node concept="1K7uuQ" id="7rbhb$VA5ob" role="1K7uuT">
      <property role="TrG5h" value="maxValueIncrease" />
      <node concept="1K7v9j" id="7rbhb$VA5oc" role="1K7sGV">
        <node concept="1_0LV8" id="7rbhb$VA5od" role="1_0VJ0">
          <node concept="19SGf9" id="7rbhb$VA5oe" role="1_0LWR">
            <node concept="19SUe$" id="7rbhb$VA5of" role="19SJt6" />
          </node>
        </node>
      </node>
    </node>
    <node concept="1K7uuQ" id="7rbhb$VA5qA" role="1K7uuT">
      <property role="TrG5h" value="minValueDecrease" />
      <node concept="1K7v9j" id="7rbhb$VA5qB" role="1K7sGV">
        <node concept="1_0LV8" id="7rbhb$VA5qC" role="1_0VJ0">
          <node concept="19SGf9" id="7rbhb$VA5qD" role="1_0LWR">
            <node concept="19SUe$" id="7rbhb$VA5qE" role="19SJt6" />
          </node>
        </node>
      </node>
    </node>
    <node concept="1K7uuQ" id="7rbhb$VA5t6" role="1K7uuT">
      <property role="TrG5h" value="maxValueDecrease" />
      <node concept="1K7v9j" id="7rbhb$VA5t7" role="1K7sGV">
        <node concept="1_0LV8" id="7rbhb$VA5t8" role="1_0VJ0">
          <node concept="19SGf9" id="7rbhb$VA5t9" role="1_0LWR">
            <node concept="19SUe$" id="7rbhb$VA5ta" role="19SJt6" />
          </node>
        </node>
      </node>
    </node>
  </node>
  <node concept="30MgvN" id="7rbhb$V_KtT">
    <property role="TrG5h" value="coolUser" />
    <node concept="30Mgg9" id="7rbhb$VA49T" role="30Mguc">
      <property role="TrG5h" value="abid1" />
      <property role="30Mgga" value="saadbin" />
      <property role="30Mgg4" value="abid" />
      <property role="30Mgg1" value="abid@fortiss.org" />
    </node>
  </node>
  <node concept="3yOg9E" id="7rbhb$VA5zv">
    <property role="TrG5h" value="controllerbehavior" />
    <node concept="1iZyVp" id="7rbhb$VA5Fo" role="1iY3eJ">
      <property role="1iZyVm" value="80" />
      <property role="1iZyVk" value="-35" />
    </node>
    <node concept="1iZyUC" id="7rbhb$VA5G6" role="1iY3eF">
      <property role="1iZyUF" value="-30" />
      <property role="1iZyU_" value="75" />
    </node>
    <node concept="3yOg1P" id="7rbhb$VA5GO" role="3yNpS6">
      <node concept="3yOhv_" id="7rbhb$VA5GP" role="3yOfZN">
        <property role="0bFFS" value="79" />
        <property role="0bFFY" value="80" />
      </node>
      <node concept="3yOhvy" id="7rbhb$VA5GQ" role="3yOfZL">
        <property role="0bFC3" value="75" />
        <property role="0bFC1" value="74" />
      </node>
      <node concept="3yOfJE" id="7rbhb$VA5GR" role="3yOfCn">
        <property role="3yOfbB" value="12.6" />
      </node>
    </node>
    <node concept="3yOg1P" id="7rbhb$VA5HC" role="3yNpS6">
      <node concept="3yOhv_" id="7rbhb$VA5HD" role="3yOfZN">
        <property role="0bFFS" value="-35" />
        <property role="0bFFY" value="79" />
      </node>
      <node concept="3yOhvy" id="7rbhb$VA5HE" role="3yOfZL">
        <property role="0bFC3" value="74" />
        <property role="0bFC1" value="-30" />
      </node>
      <node concept="3yOfJE" id="7rbhb$VA5HF" role="3yOfCn">
        <property role="3yOfbB" value="11.2" />
      </node>
    </node>
  </node>
</model>

