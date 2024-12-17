<?xml version = '1.0' encoding = 'ISO-8859-1' ?>
<asm version="1.0" name="0">
	<cp>
		<constant value="AlgoToAlgorithmeTable"/>
		<constant value="links"/>
		<constant value="NTransientLinkSet;"/>
		<constant value="col"/>
		<constant value="J"/>
		<constant value="main"/>
		<constant value="A"/>
		<constant value="OclParametrizedType"/>
		<constant value="#native"/>
		<constant value="Collection"/>
		<constant value="J.setName(S):V"/>
		<constant value="OclSimpleType"/>
		<constant value="OclAny"/>
		<constant value="J.setElementType(J):V"/>
		<constant value="TransientLinkSet"/>
		<constant value="A.__matcher__():V"/>
		<constant value="A.__exec__():V"/>
		<constant value="self"/>
		<constant value="__resolve__"/>
		<constant value="1"/>
		<constant value="J.oclIsKindOf(J):B"/>
		<constant value="18"/>
		<constant value="NTransientLinkSet;.getLinkBySourceElement(S):QNTransientLink;"/>
		<constant value="J.oclIsUndefined():B"/>
		<constant value="15"/>
		<constant value="NTransientLink;.getTargetFromSource(J):J"/>
		<constant value="17"/>
		<constant value="30"/>
		<constant value="Sequence"/>
		<constant value="2"/>
		<constant value="A.__resolve__(J):J"/>
		<constant value="QJ.including(J):QJ"/>
		<constant value="QJ.flatten():QJ"/>
		<constant value="e"/>
		<constant value="value"/>
		<constant value="resolveTemp"/>
		<constant value="S"/>
		<constant value="NTransientLink;.getNamedTargetFromSource(JS):J"/>
		<constant value="name"/>
		<constant value="__matcher__"/>
		<constant value="A.__matchCatalogueToTable():V"/>
		<constant value="A.__matchAlgorithmeToAlgorithme():V"/>
		<constant value="A.__matchRessourceToRessource():V"/>
		<constant value="A.__matchPortToPort():V"/>
		<constant value="__exec__"/>
		<constant value="CatalogueToTable"/>
		<constant value="NTransientLinkSet;.getLinksByRule(S):QNTransientLink;"/>
		<constant value="A.__applyCatalogueToTable(NTransientLink;):V"/>
		<constant value="AlgorithmeToAlgorithme"/>
		<constant value="A.__applyAlgorithmeToAlgorithme(NTransientLink;):V"/>
		<constant value="RessourceToRessource"/>
		<constant value="A.__applyRessourceToRessource(NTransientLink;):V"/>
		<constant value="PortToPort"/>
		<constant value="A.__applyPortToPort(NTransientLink;):V"/>
		<constant value="__matchCatalogueToTable"/>
		<constant value="Catalogue"/>
		<constant value="Algo"/>
		<constant value="IN"/>
		<constant value="MMOF!Classifier;.allInstancesFrom(S):QJ"/>
		<constant value="TransientLink"/>
		<constant value="NTransientLink;.setRule(MATL!Rule;):V"/>
		<constant value="src"/>
		<constant value="NTransientLink;.addSourceElement(SJ):V"/>
		<constant value="tgt"/>
		<constant value="AlgorithmeTable"/>
		<constant value="NTransientLink;.addTargetElement(SJ):V"/>
		<constant value="NTransientLinkSet;.addLink2(NTransientLink;B):V"/>
		<constant value="11:9-14:10"/>
		<constant value="__applyCatalogueToTable"/>
		<constant value="NTransientLink;"/>
		<constant value="NTransientLink;.getSourceElement(S):J"/>
		<constant value="NTransientLink;.getTargetElement(S):J"/>
		<constant value="3"/>
		<constant value="nom"/>
		<constant value="algorithmes"/>
		<constant value="algorithme"/>
		<constant value="12:20-12:23"/>
		<constant value="12:20-12:27"/>
		<constant value="12:13-12:27"/>
		<constant value="13:27-13:30"/>
		<constant value="13:27-13:42"/>
		<constant value="13:13-13:42"/>
		<constant value="link"/>
		<constant value="__matchAlgorithmeToAlgorithme"/>
		<constant value="Algorithme"/>
		<constant value="22:9-27:10"/>
		<constant value="__applyAlgorithmeToAlgorithme"/>
		<constant value="documentation"/>
		<constant value="port"/>
		<constant value="ressource"/>
		<constant value="23:20-23:23"/>
		<constant value="23:20-23:27"/>
		<constant value="23:13-23:27"/>
		<constant value="24:30-24:33"/>
		<constant value="24:30-24:47"/>
		<constant value="24:13-24:47"/>
		<constant value="25:12-25:15"/>
		<constant value="25:12-25:20"/>
		<constant value="25:4-25:20"/>
		<constant value="26:17-26:20"/>
		<constant value="26:17-26:30"/>
		<constant value="26:4-26:30"/>
		<constant value="__matchRessourceToRessource"/>
		<constant value="Ressource"/>
		<constant value="35:9-38:10"/>
		<constant value="__applyRessourceToRessource"/>
		<constant value="type"/>
		<constant value="Type"/>
		<constant value="emplacement"/>
		<constant value="Emplacement"/>
		<constant value="36:21-36:24"/>
		<constant value="36:21-36:29"/>
		<constant value="36:13-36:29"/>
		<constant value="37:28-37:31"/>
		<constant value="37:28-37:43"/>
		<constant value="37:13-37:43"/>
		<constant value="__matchPortToPort"/>
		<constant value="Port"/>
		<constant value="46:9-50:10"/>
		<constant value="__applyPortToPort"/>
		<constant value="direction"/>
		<constant value="47:20-47:23"/>
		<constant value="47:20-47:27"/>
		<constant value="47:13-47:27"/>
		<constant value="48:21-48:24"/>
		<constant value="48:21-48:29"/>
		<constant value="48:13-48:29"/>
		<constant value="49:26-49:29"/>
		<constant value="49:26-49:39"/>
		<constant value="49:13-49:39"/>
	</cp>
	<field name="1" type="2"/>
	<field name="3" type="4"/>
	<operation name="5">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<push arg="7"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="9"/>
			<pcall arg="10"/>
			<dup/>
			<push arg="11"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="12"/>
			<pcall arg="10"/>
			<pcall arg="13"/>
			<set arg="3"/>
			<getasm/>
			<push arg="14"/>
			<push arg="8"/>
			<new/>
			<set arg="1"/>
			<getasm/>
			<pcall arg="15"/>
			<getasm/>
			<pcall arg="16"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="24"/>
		</localvariabletable>
	</operation>
	<operation name="18">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
		</parameters>
		<code>
			<load arg="19"/>
			<getasm/>
			<get arg="3"/>
			<call arg="20"/>
			<if arg="21"/>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<dup/>
			<call arg="23"/>
			<if arg="24"/>
			<load arg="19"/>
			<call arg="25"/>
			<goto arg="26"/>
			<pop/>
			<load arg="19"/>
			<goto arg="27"/>
			<push arg="28"/>
			<push arg="8"/>
			<new/>
			<load arg="19"/>
			<iterate/>
			<store arg="29"/>
			<getasm/>
			<load arg="29"/>
			<call arg="30"/>
			<call arg="31"/>
			<enditerate/>
			<call arg="32"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="2" name="33" begin="23" end="27"/>
			<lve slot="0" name="17" begin="0" end="29"/>
			<lve slot="1" name="34" begin="0" end="29"/>
		</localvariabletable>
	</operation>
	<operation name="35">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="4"/>
			<parameter name="29" type="36"/>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<load arg="19"/>
			<call arg="22"/>
			<load arg="19"/>
			<load arg="29"/>
			<call arg="37"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="6"/>
			<lve slot="1" name="34" begin="0" end="6"/>
			<lve slot="2" name="38" begin="0" end="6"/>
		</localvariabletable>
	</operation>
	<operation name="39">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<pcall arg="40"/>
			<getasm/>
			<pcall arg="41"/>
			<getasm/>
			<pcall arg="42"/>
			<getasm/>
			<pcall arg="43"/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="0" name="17" begin="0" end="7"/>
		</localvariabletable>
	</operation>
	<operation name="44">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<getasm/>
			<get arg="1"/>
			<push arg="45"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="47"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="48"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="49"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="50"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="51"/>
			<enditerate/>
			<getasm/>
			<get arg="1"/>
			<push arg="52"/>
			<call arg="46"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<load arg="19"/>
			<pcall arg="53"/>
			<enditerate/>
		</code>
		<linenumbertable>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="33" begin="5" end="8"/>
			<lve slot="1" name="33" begin="15" end="18"/>
			<lve slot="1" name="33" begin="25" end="28"/>
			<lve slot="1" name="33" begin="35" end="38"/>
			<lve slot="0" name="17" begin="0" end="39"/>
		</localvariabletable>
	</operation>
	<operation name="54">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="55"/>
			<push arg="56"/>
			<findme/>
			<push arg="57"/>
			<call arg="58"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="59"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="45"/>
			<pcall arg="60"/>
			<dup/>
			<push arg="61"/>
			<load arg="19"/>
			<pcall arg="62"/>
			<dup/>
			<push arg="63"/>
			<push arg="55"/>
			<push arg="64"/>
			<new/>
			<pcall arg="65"/>
			<pusht/>
			<pcall arg="66"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="67" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="61" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="68">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="69"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="61"/>
			<call arg="70"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="63"/>
			<call arg="71"/>
			<store arg="72"/>
			<load arg="72"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="73"/>
			<call arg="30"/>
			<set arg="73"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="74"/>
			<call arg="30"/>
			<set arg="75"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="76" begin="11" end="11"/>
			<lne id="77" begin="11" end="12"/>
			<lne id="78" begin="9" end="14"/>
			<lne id="79" begin="17" end="17"/>
			<lne id="80" begin="17" end="18"/>
			<lne id="81" begin="15" end="20"/>
			<lne id="67" begin="8" end="21"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="63" begin="7" end="21"/>
			<lve slot="2" name="61" begin="3" end="21"/>
			<lve slot="0" name="17" begin="0" end="21"/>
			<lve slot="1" name="82" begin="0" end="21"/>
		</localvariabletable>
	</operation>
	<operation name="83">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="84"/>
			<push arg="56"/>
			<findme/>
			<push arg="57"/>
			<call arg="58"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="59"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="48"/>
			<pcall arg="60"/>
			<dup/>
			<push arg="61"/>
			<load arg="19"/>
			<pcall arg="62"/>
			<dup/>
			<push arg="63"/>
			<push arg="84"/>
			<push arg="64"/>
			<new/>
			<pcall arg="65"/>
			<pusht/>
			<pcall arg="66"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="85" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="61" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="86">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="69"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="61"/>
			<call arg="70"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="63"/>
			<call arg="71"/>
			<store arg="72"/>
			<load arg="72"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="73"/>
			<call arg="30"/>
			<set arg="73"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="87"/>
			<call arg="30"/>
			<set arg="87"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="88"/>
			<call arg="30"/>
			<set arg="88"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="89"/>
			<call arg="30"/>
			<set arg="89"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="90" begin="11" end="11"/>
			<lne id="91" begin="11" end="12"/>
			<lne id="92" begin="9" end="14"/>
			<lne id="93" begin="17" end="17"/>
			<lne id="94" begin="17" end="18"/>
			<lne id="95" begin="15" end="20"/>
			<lne id="96" begin="23" end="23"/>
			<lne id="97" begin="23" end="24"/>
			<lne id="98" begin="21" end="26"/>
			<lne id="99" begin="29" end="29"/>
			<lne id="100" begin="29" end="30"/>
			<lne id="101" begin="27" end="32"/>
			<lne id="85" begin="8" end="33"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="63" begin="7" end="33"/>
			<lve slot="2" name="61" begin="3" end="33"/>
			<lve slot="0" name="17" begin="0" end="33"/>
			<lve slot="1" name="82" begin="0" end="33"/>
		</localvariabletable>
	</operation>
	<operation name="102">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="103"/>
			<push arg="56"/>
			<findme/>
			<push arg="57"/>
			<call arg="58"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="59"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="50"/>
			<pcall arg="60"/>
			<dup/>
			<push arg="61"/>
			<load arg="19"/>
			<pcall arg="62"/>
			<dup/>
			<push arg="63"/>
			<push arg="103"/>
			<push arg="64"/>
			<new/>
			<pcall arg="65"/>
			<pusht/>
			<pcall arg="66"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="104" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="61" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="105">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="69"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="61"/>
			<call arg="70"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="63"/>
			<call arg="71"/>
			<store arg="72"/>
			<load arg="72"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="106"/>
			<call arg="30"/>
			<set arg="107"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="108"/>
			<call arg="30"/>
			<set arg="109"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="110" begin="11" end="11"/>
			<lne id="111" begin="11" end="12"/>
			<lne id="112" begin="9" end="14"/>
			<lne id="113" begin="17" end="17"/>
			<lne id="114" begin="17" end="18"/>
			<lne id="115" begin="15" end="20"/>
			<lne id="104" begin="8" end="21"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="63" begin="7" end="21"/>
			<lve slot="2" name="61" begin="3" end="21"/>
			<lve slot="0" name="17" begin="0" end="21"/>
			<lve slot="1" name="82" begin="0" end="21"/>
		</localvariabletable>
	</operation>
	<operation name="116">
		<context type="6"/>
		<parameters>
		</parameters>
		<code>
			<push arg="117"/>
			<push arg="56"/>
			<findme/>
			<push arg="57"/>
			<call arg="58"/>
			<iterate/>
			<store arg="19"/>
			<getasm/>
			<get arg="1"/>
			<push arg="59"/>
			<push arg="8"/>
			<new/>
			<dup/>
			<push arg="52"/>
			<pcall arg="60"/>
			<dup/>
			<push arg="61"/>
			<load arg="19"/>
			<pcall arg="62"/>
			<dup/>
			<push arg="63"/>
			<push arg="117"/>
			<push arg="64"/>
			<new/>
			<pcall arg="65"/>
			<pusht/>
			<pcall arg="66"/>
			<enditerate/>
		</code>
		<linenumbertable>
			<lne id="118" begin="19" end="24"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="1" name="61" begin="6" end="26"/>
			<lve slot="0" name="17" begin="0" end="27"/>
		</localvariabletable>
	</operation>
	<operation name="119">
		<context type="6"/>
		<parameters>
			<parameter name="19" type="69"/>
		</parameters>
		<code>
			<load arg="19"/>
			<push arg="61"/>
			<call arg="70"/>
			<store arg="29"/>
			<load arg="19"/>
			<push arg="63"/>
			<call arg="71"/>
			<store arg="72"/>
			<load arg="72"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="73"/>
			<call arg="30"/>
			<set arg="73"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="106"/>
			<call arg="30"/>
			<set arg="106"/>
			<dup/>
			<getasm/>
			<load arg="29"/>
			<get arg="120"/>
			<call arg="30"/>
			<set arg="120"/>
			<pop/>
		</code>
		<linenumbertable>
			<lne id="121" begin="11" end="11"/>
			<lne id="122" begin="11" end="12"/>
			<lne id="123" begin="9" end="14"/>
			<lne id="124" begin="17" end="17"/>
			<lne id="125" begin="17" end="18"/>
			<lne id="126" begin="15" end="20"/>
			<lne id="127" begin="23" end="23"/>
			<lne id="128" begin="23" end="24"/>
			<lne id="129" begin="21" end="26"/>
			<lne id="118" begin="8" end="27"/>
		</linenumbertable>
		<localvariabletable>
			<lve slot="3" name="63" begin="7" end="27"/>
			<lve slot="2" name="61" begin="3" end="27"/>
			<lve slot="0" name="17" begin="0" end="27"/>
			<lve slot="1" name="82" begin="0" end="27"/>
		</localvariabletable>
	</operation>
</asm>
