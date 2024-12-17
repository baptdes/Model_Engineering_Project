package org.xtext.algorithme.algo.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import org.xtext.algorithme.algo.services.AlgoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlgoParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Python'", "'Script'", "'Entree'", "'Sortie'", "'int'", "'float'", "'str'", "'bool'", "'catalogue'", "'{'", "'}'", "'algorithm'", "'documentation'", "'ressource'", "'ports'", "'path'", "':'", "'constant'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalAlgoParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAlgoParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAlgoParser.tokenNames; }
    public String getGrammarFileName() { return "InternalAlgo.g"; }


    	private AlgoGrammarAccess grammarAccess;

    	public void setGrammarAccess(AlgoGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleCatalogue"
    // InternalAlgo.g:53:1: entryRuleCatalogue : ruleCatalogue EOF ;
    public final void entryRuleCatalogue() throws RecognitionException {
        try {
            // InternalAlgo.g:54:1: ( ruleCatalogue EOF )
            // InternalAlgo.g:55:1: ruleCatalogue EOF
            {
             before(grammarAccess.getCatalogueRule()); 
            pushFollow(FOLLOW_1);
            ruleCatalogue();

            state._fsp--;

             after(grammarAccess.getCatalogueRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCatalogue"


    // $ANTLR start "ruleCatalogue"
    // InternalAlgo.g:62:1: ruleCatalogue : ( ( rule__Catalogue__Group__0 ) ) ;
    public final void ruleCatalogue() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:66:2: ( ( ( rule__Catalogue__Group__0 ) ) )
            // InternalAlgo.g:67:2: ( ( rule__Catalogue__Group__0 ) )
            {
            // InternalAlgo.g:67:2: ( ( rule__Catalogue__Group__0 ) )
            // InternalAlgo.g:68:3: ( rule__Catalogue__Group__0 )
            {
             before(grammarAccess.getCatalogueAccess().getGroup()); 
            // InternalAlgo.g:69:3: ( rule__Catalogue__Group__0 )
            // InternalAlgo.g:69:4: rule__Catalogue__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Catalogue__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCatalogueAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCatalogue"


    // $ANTLR start "entryRuleAlgorithme"
    // InternalAlgo.g:78:1: entryRuleAlgorithme : ruleAlgorithme EOF ;
    public final void entryRuleAlgorithme() throws RecognitionException {
        try {
            // InternalAlgo.g:79:1: ( ruleAlgorithme EOF )
            // InternalAlgo.g:80:1: ruleAlgorithme EOF
            {
             before(grammarAccess.getAlgorithmeRule()); 
            pushFollow(FOLLOW_1);
            ruleAlgorithme();

            state._fsp--;

             after(grammarAccess.getAlgorithmeRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleAlgorithme"


    // $ANTLR start "ruleAlgorithme"
    // InternalAlgo.g:87:1: ruleAlgorithme : ( ( rule__Algorithme__Group__0 ) ) ;
    public final void ruleAlgorithme() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:91:2: ( ( ( rule__Algorithme__Group__0 ) ) )
            // InternalAlgo.g:92:2: ( ( rule__Algorithme__Group__0 ) )
            {
            // InternalAlgo.g:92:2: ( ( rule__Algorithme__Group__0 ) )
            // InternalAlgo.g:93:3: ( rule__Algorithme__Group__0 )
            {
             before(grammarAccess.getAlgorithmeAccess().getGroup()); 
            // InternalAlgo.g:94:3: ( rule__Algorithme__Group__0 )
            // InternalAlgo.g:94:4: rule__Algorithme__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Algorithme__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmeAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlgorithme"


    // $ANTLR start "entryRuleRessource"
    // InternalAlgo.g:103:1: entryRuleRessource : ruleRessource EOF ;
    public final void entryRuleRessource() throws RecognitionException {
        try {
            // InternalAlgo.g:104:1: ( ruleRessource EOF )
            // InternalAlgo.g:105:1: ruleRessource EOF
            {
             before(grammarAccess.getRessourceRule()); 
            pushFollow(FOLLOW_1);
            ruleRessource();

            state._fsp--;

             after(grammarAccess.getRessourceRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRessource"


    // $ANTLR start "ruleRessource"
    // InternalAlgo.g:112:1: ruleRessource : ( ( rule__Ressource__Group__0 ) ) ;
    public final void ruleRessource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:116:2: ( ( ( rule__Ressource__Group__0 ) ) )
            // InternalAlgo.g:117:2: ( ( rule__Ressource__Group__0 ) )
            {
            // InternalAlgo.g:117:2: ( ( rule__Ressource__Group__0 ) )
            // InternalAlgo.g:118:3: ( rule__Ressource__Group__0 )
            {
             before(grammarAccess.getRessourceAccess().getGroup()); 
            // InternalAlgo.g:119:3: ( rule__Ressource__Group__0 )
            // InternalAlgo.g:119:4: rule__Ressource__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRessource"


    // $ANTLR start "entryRulePort"
    // InternalAlgo.g:128:1: entryRulePort : rulePort EOF ;
    public final void entryRulePort() throws RecognitionException {
        try {
            // InternalAlgo.g:129:1: ( rulePort EOF )
            // InternalAlgo.g:130:1: rulePort EOF
            {
             before(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            rulePort();

            state._fsp--;

             after(grammarAccess.getPortRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalAlgo.g:137:1: rulePort : ( ( rule__Port__Group__0 ) ) ;
    public final void rulePort() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:141:2: ( ( ( rule__Port__Group__0 ) ) )
            // InternalAlgo.g:142:2: ( ( rule__Port__Group__0 ) )
            {
            // InternalAlgo.g:142:2: ( ( rule__Port__Group__0 ) )
            // InternalAlgo.g:143:3: ( rule__Port__Group__0 )
            {
             before(grammarAccess.getPortAccess().getGroup()); 
            // InternalAlgo.g:144:3: ( rule__Port__Group__0 )
            // InternalAlgo.g:144:4: rule__Port__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "ruleTypeRessource"
    // InternalAlgo.g:153:1: ruleTypeRessource : ( ( rule__TypeRessource__Alternatives ) ) ;
    public final void ruleTypeRessource() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:157:1: ( ( ( rule__TypeRessource__Alternatives ) ) )
            // InternalAlgo.g:158:2: ( ( rule__TypeRessource__Alternatives ) )
            {
            // InternalAlgo.g:158:2: ( ( rule__TypeRessource__Alternatives ) )
            // InternalAlgo.g:159:3: ( rule__TypeRessource__Alternatives )
            {
             before(grammarAccess.getTypeRessourceAccess().getAlternatives()); 
            // InternalAlgo.g:160:3: ( rule__TypeRessource__Alternatives )
            // InternalAlgo.g:160:4: rule__TypeRessource__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeRessource__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeRessourceAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeRessource"


    // $ANTLR start "ruleDirection"
    // InternalAlgo.g:169:1: ruleDirection : ( ( rule__Direction__Alternatives ) ) ;
    public final void ruleDirection() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:173:1: ( ( ( rule__Direction__Alternatives ) ) )
            // InternalAlgo.g:174:2: ( ( rule__Direction__Alternatives ) )
            {
            // InternalAlgo.g:174:2: ( ( rule__Direction__Alternatives ) )
            // InternalAlgo.g:175:3: ( rule__Direction__Alternatives )
            {
             before(grammarAccess.getDirectionAccess().getAlternatives()); 
            // InternalAlgo.g:176:3: ( rule__Direction__Alternatives )
            // InternalAlgo.g:176:4: rule__Direction__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Direction__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getDirectionAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleDirection"


    // $ANTLR start "ruleTypeDonnees"
    // InternalAlgo.g:185:1: ruleTypeDonnees : ( ( rule__TypeDonnees__Alternatives ) ) ;
    public final void ruleTypeDonnees() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:189:1: ( ( ( rule__TypeDonnees__Alternatives ) ) )
            // InternalAlgo.g:190:2: ( ( rule__TypeDonnees__Alternatives ) )
            {
            // InternalAlgo.g:190:2: ( ( rule__TypeDonnees__Alternatives ) )
            // InternalAlgo.g:191:3: ( rule__TypeDonnees__Alternatives )
            {
             before(grammarAccess.getTypeDonneesAccess().getAlternatives()); 
            // InternalAlgo.g:192:3: ( rule__TypeDonnees__Alternatives )
            // InternalAlgo.g:192:4: rule__TypeDonnees__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__TypeDonnees__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getTypeDonneesAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleTypeDonnees"


    // $ANTLR start "rule__TypeRessource__Alternatives"
    // InternalAlgo.g:200:1: rule__TypeRessource__Alternatives : ( ( ( 'Python' ) ) | ( ( 'Script' ) ) );
    public final void rule__TypeRessource__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:204:1: ( ( ( 'Python' ) ) | ( ( 'Script' ) ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==11) ) {
                alt1=1;
            }
            else if ( (LA1_0==12) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalAlgo.g:205:2: ( ( 'Python' ) )
                    {
                    // InternalAlgo.g:205:2: ( ( 'Python' ) )
                    // InternalAlgo.g:206:3: ( 'Python' )
                    {
                     before(grammarAccess.getTypeRessourceAccess().getPythonEnumLiteralDeclaration_0()); 
                    // InternalAlgo.g:207:3: ( 'Python' )
                    // InternalAlgo.g:207:4: 'Python'
                    {
                    match(input,11,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeRessourceAccess().getPythonEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlgo.g:211:2: ( ( 'Script' ) )
                    {
                    // InternalAlgo.g:211:2: ( ( 'Script' ) )
                    // InternalAlgo.g:212:3: ( 'Script' )
                    {
                     before(grammarAccess.getTypeRessourceAccess().getScriptEnumLiteralDeclaration_1()); 
                    // InternalAlgo.g:213:3: ( 'Script' )
                    // InternalAlgo.g:213:4: 'Script'
                    {
                    match(input,12,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeRessourceAccess().getScriptEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeRessource__Alternatives"


    // $ANTLR start "rule__Direction__Alternatives"
    // InternalAlgo.g:221:1: rule__Direction__Alternatives : ( ( ( 'Entree' ) ) | ( ( 'Sortie' ) ) );
    public final void rule__Direction__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:225:1: ( ( ( 'Entree' ) ) | ( ( 'Sortie' ) ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==14) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalAlgo.g:226:2: ( ( 'Entree' ) )
                    {
                    // InternalAlgo.g:226:2: ( ( 'Entree' ) )
                    // InternalAlgo.g:227:3: ( 'Entree' )
                    {
                     before(grammarAccess.getDirectionAccess().getEntreeEnumLiteralDeclaration_0()); 
                    // InternalAlgo.g:228:3: ( 'Entree' )
                    // InternalAlgo.g:228:4: 'Entree'
                    {
                    match(input,13,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getEntreeEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlgo.g:232:2: ( ( 'Sortie' ) )
                    {
                    // InternalAlgo.g:232:2: ( ( 'Sortie' ) )
                    // InternalAlgo.g:233:3: ( 'Sortie' )
                    {
                     before(grammarAccess.getDirectionAccess().getSortieEnumLiteralDeclaration_1()); 
                    // InternalAlgo.g:234:3: ( 'Sortie' )
                    // InternalAlgo.g:234:4: 'Sortie'
                    {
                    match(input,14,FOLLOW_2); 

                    }

                     after(grammarAccess.getDirectionAccess().getSortieEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Direction__Alternatives"


    // $ANTLR start "rule__TypeDonnees__Alternatives"
    // InternalAlgo.g:242:1: rule__TypeDonnees__Alternatives : ( ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'str' ) ) | ( ( 'bool' ) ) );
    public final void rule__TypeDonnees__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:246:1: ( ( ( 'int' ) ) | ( ( 'float' ) ) | ( ( 'str' ) ) | ( ( 'bool' ) ) )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 15:
                {
                alt3=1;
                }
                break;
            case 16:
                {
                alt3=2;
                }
                break;
            case 17:
                {
                alt3=3;
                }
                break;
            case 18:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // InternalAlgo.g:247:2: ( ( 'int' ) )
                    {
                    // InternalAlgo.g:247:2: ( ( 'int' ) )
                    // InternalAlgo.g:248:3: ( 'int' )
                    {
                     before(grammarAccess.getTypeDonneesAccess().getIntEnumLiteralDeclaration_0()); 
                    // InternalAlgo.g:249:3: ( 'int' )
                    // InternalAlgo.g:249:4: 'int'
                    {
                    match(input,15,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeDonneesAccess().getIntEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalAlgo.g:253:2: ( ( 'float' ) )
                    {
                    // InternalAlgo.g:253:2: ( ( 'float' ) )
                    // InternalAlgo.g:254:3: ( 'float' )
                    {
                     before(grammarAccess.getTypeDonneesAccess().getFloatEnumLiteralDeclaration_1()); 
                    // InternalAlgo.g:255:3: ( 'float' )
                    // InternalAlgo.g:255:4: 'float'
                    {
                    match(input,16,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeDonneesAccess().getFloatEnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalAlgo.g:259:2: ( ( 'str' ) )
                    {
                    // InternalAlgo.g:259:2: ( ( 'str' ) )
                    // InternalAlgo.g:260:3: ( 'str' )
                    {
                     before(grammarAccess.getTypeDonneesAccess().getStrEnumLiteralDeclaration_2()); 
                    // InternalAlgo.g:261:3: ( 'str' )
                    // InternalAlgo.g:261:4: 'str'
                    {
                    match(input,17,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeDonneesAccess().getStrEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // InternalAlgo.g:265:2: ( ( 'bool' ) )
                    {
                    // InternalAlgo.g:265:2: ( ( 'bool' ) )
                    // InternalAlgo.g:266:3: ( 'bool' )
                    {
                     before(grammarAccess.getTypeDonneesAccess().getBoolEnumLiteralDeclaration_3()); 
                    // InternalAlgo.g:267:3: ( 'bool' )
                    // InternalAlgo.g:267:4: 'bool'
                    {
                    match(input,18,FOLLOW_2); 

                    }

                     after(grammarAccess.getTypeDonneesAccess().getBoolEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__TypeDonnees__Alternatives"


    // $ANTLR start "rule__Catalogue__Group__0"
    // InternalAlgo.g:275:1: rule__Catalogue__Group__0 : rule__Catalogue__Group__0__Impl rule__Catalogue__Group__1 ;
    public final void rule__Catalogue__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:279:1: ( rule__Catalogue__Group__0__Impl rule__Catalogue__Group__1 )
            // InternalAlgo.g:280:2: rule__Catalogue__Group__0__Impl rule__Catalogue__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Catalogue__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Catalogue__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogue__Group__0"


    // $ANTLR start "rule__Catalogue__Group__0__Impl"
    // InternalAlgo.g:287:1: rule__Catalogue__Group__0__Impl : ( 'catalogue' ) ;
    public final void rule__Catalogue__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:291:1: ( ( 'catalogue' ) )
            // InternalAlgo.g:292:1: ( 'catalogue' )
            {
            // InternalAlgo.g:292:1: ( 'catalogue' )
            // InternalAlgo.g:293:2: 'catalogue'
            {
             before(grammarAccess.getCatalogueAccess().getCatalogueKeyword_0()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCatalogueAccess().getCatalogueKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogue__Group__0__Impl"


    // $ANTLR start "rule__Catalogue__Group__1"
    // InternalAlgo.g:302:1: rule__Catalogue__Group__1 : rule__Catalogue__Group__1__Impl rule__Catalogue__Group__2 ;
    public final void rule__Catalogue__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:306:1: ( rule__Catalogue__Group__1__Impl rule__Catalogue__Group__2 )
            // InternalAlgo.g:307:2: rule__Catalogue__Group__1__Impl rule__Catalogue__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Catalogue__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Catalogue__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogue__Group__1"


    // $ANTLR start "rule__Catalogue__Group__1__Impl"
    // InternalAlgo.g:314:1: rule__Catalogue__Group__1__Impl : ( ( rule__Catalogue__NomAssignment_1 ) ) ;
    public final void rule__Catalogue__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:318:1: ( ( ( rule__Catalogue__NomAssignment_1 ) ) )
            // InternalAlgo.g:319:1: ( ( rule__Catalogue__NomAssignment_1 ) )
            {
            // InternalAlgo.g:319:1: ( ( rule__Catalogue__NomAssignment_1 ) )
            // InternalAlgo.g:320:2: ( rule__Catalogue__NomAssignment_1 )
            {
             before(grammarAccess.getCatalogueAccess().getNomAssignment_1()); 
            // InternalAlgo.g:321:2: ( rule__Catalogue__NomAssignment_1 )
            // InternalAlgo.g:321:3: rule__Catalogue__NomAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Catalogue__NomAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCatalogueAccess().getNomAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogue__Group__1__Impl"


    // $ANTLR start "rule__Catalogue__Group__2"
    // InternalAlgo.g:329:1: rule__Catalogue__Group__2 : rule__Catalogue__Group__2__Impl rule__Catalogue__Group__3 ;
    public final void rule__Catalogue__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:333:1: ( rule__Catalogue__Group__2__Impl rule__Catalogue__Group__3 )
            // InternalAlgo.g:334:2: rule__Catalogue__Group__2__Impl rule__Catalogue__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Catalogue__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Catalogue__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogue__Group__2"


    // $ANTLR start "rule__Catalogue__Group__2__Impl"
    // InternalAlgo.g:341:1: rule__Catalogue__Group__2__Impl : ( '{' ) ;
    public final void rule__Catalogue__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:345:1: ( ( '{' ) )
            // InternalAlgo.g:346:1: ( '{' )
            {
            // InternalAlgo.g:346:1: ( '{' )
            // InternalAlgo.g:347:2: '{'
            {
             before(grammarAccess.getCatalogueAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCatalogueAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogue__Group__2__Impl"


    // $ANTLR start "rule__Catalogue__Group__3"
    // InternalAlgo.g:356:1: rule__Catalogue__Group__3 : rule__Catalogue__Group__3__Impl rule__Catalogue__Group__4 ;
    public final void rule__Catalogue__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:360:1: ( rule__Catalogue__Group__3__Impl rule__Catalogue__Group__4 )
            // InternalAlgo.g:361:2: rule__Catalogue__Group__3__Impl rule__Catalogue__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Catalogue__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Catalogue__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogue__Group__3"


    // $ANTLR start "rule__Catalogue__Group__3__Impl"
    // InternalAlgo.g:368:1: rule__Catalogue__Group__3__Impl : ( ( rule__Catalogue__AlgorithmesAssignment_3 )* ) ;
    public final void rule__Catalogue__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:372:1: ( ( ( rule__Catalogue__AlgorithmesAssignment_3 )* ) )
            // InternalAlgo.g:373:1: ( ( rule__Catalogue__AlgorithmesAssignment_3 )* )
            {
            // InternalAlgo.g:373:1: ( ( rule__Catalogue__AlgorithmesAssignment_3 )* )
            // InternalAlgo.g:374:2: ( rule__Catalogue__AlgorithmesAssignment_3 )*
            {
             before(grammarAccess.getCatalogueAccess().getAlgorithmesAssignment_3()); 
            // InternalAlgo.g:375:2: ( rule__Catalogue__AlgorithmesAssignment_3 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalAlgo.g:375:3: rule__Catalogue__AlgorithmesAssignment_3
            	    {
            	    pushFollow(FOLLOW_6);
            	    rule__Catalogue__AlgorithmesAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCatalogueAccess().getAlgorithmesAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogue__Group__3__Impl"


    // $ANTLR start "rule__Catalogue__Group__4"
    // InternalAlgo.g:383:1: rule__Catalogue__Group__4 : rule__Catalogue__Group__4__Impl ;
    public final void rule__Catalogue__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:387:1: ( rule__Catalogue__Group__4__Impl )
            // InternalAlgo.g:388:2: rule__Catalogue__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Catalogue__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogue__Group__4"


    // $ANTLR start "rule__Catalogue__Group__4__Impl"
    // InternalAlgo.g:394:1: rule__Catalogue__Group__4__Impl : ( '}' ) ;
    public final void rule__Catalogue__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:398:1: ( ( '}' ) )
            // InternalAlgo.g:399:1: ( '}' )
            {
            // InternalAlgo.g:399:1: ( '}' )
            // InternalAlgo.g:400:2: '}'
            {
             before(grammarAccess.getCatalogueAccess().getRightCurlyBracketKeyword_4()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCatalogueAccess().getRightCurlyBracketKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogue__Group__4__Impl"


    // $ANTLR start "rule__Algorithme__Group__0"
    // InternalAlgo.g:410:1: rule__Algorithme__Group__0 : rule__Algorithme__Group__0__Impl rule__Algorithme__Group__1 ;
    public final void rule__Algorithme__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:414:1: ( rule__Algorithme__Group__0__Impl rule__Algorithme__Group__1 )
            // InternalAlgo.g:415:2: rule__Algorithme__Group__0__Impl rule__Algorithme__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Algorithme__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithme__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__0"


    // $ANTLR start "rule__Algorithme__Group__0__Impl"
    // InternalAlgo.g:422:1: rule__Algorithme__Group__0__Impl : ( 'algorithm' ) ;
    public final void rule__Algorithme__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:426:1: ( ( 'algorithm' ) )
            // InternalAlgo.g:427:1: ( 'algorithm' )
            {
            // InternalAlgo.g:427:1: ( 'algorithm' )
            // InternalAlgo.g:428:2: 'algorithm'
            {
             before(grammarAccess.getAlgorithmeAccess().getAlgorithmKeyword_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getAlgorithmeAccess().getAlgorithmKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__0__Impl"


    // $ANTLR start "rule__Algorithme__Group__1"
    // InternalAlgo.g:437:1: rule__Algorithme__Group__1 : rule__Algorithme__Group__1__Impl rule__Algorithme__Group__2 ;
    public final void rule__Algorithme__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:441:1: ( rule__Algorithme__Group__1__Impl rule__Algorithme__Group__2 )
            // InternalAlgo.g:442:2: rule__Algorithme__Group__1__Impl rule__Algorithme__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Algorithme__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithme__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__1"


    // $ANTLR start "rule__Algorithme__Group__1__Impl"
    // InternalAlgo.g:449:1: rule__Algorithme__Group__1__Impl : ( ( rule__Algorithme__NomAssignment_1 ) ) ;
    public final void rule__Algorithme__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:453:1: ( ( ( rule__Algorithme__NomAssignment_1 ) ) )
            // InternalAlgo.g:454:1: ( ( rule__Algorithme__NomAssignment_1 ) )
            {
            // InternalAlgo.g:454:1: ( ( rule__Algorithme__NomAssignment_1 ) )
            // InternalAlgo.g:455:2: ( rule__Algorithme__NomAssignment_1 )
            {
             before(grammarAccess.getAlgorithmeAccess().getNomAssignment_1()); 
            // InternalAlgo.g:456:2: ( rule__Algorithme__NomAssignment_1 )
            // InternalAlgo.g:456:3: rule__Algorithme__NomAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Algorithme__NomAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmeAccess().getNomAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__1__Impl"


    // $ANTLR start "rule__Algorithme__Group__2"
    // InternalAlgo.g:464:1: rule__Algorithme__Group__2 : rule__Algorithme__Group__2__Impl rule__Algorithme__Group__3 ;
    public final void rule__Algorithme__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:468:1: ( rule__Algorithme__Group__2__Impl rule__Algorithme__Group__3 )
            // InternalAlgo.g:469:2: rule__Algorithme__Group__2__Impl rule__Algorithme__Group__3
            {
            pushFollow(FOLLOW_7);
            rule__Algorithme__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithme__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__2"


    // $ANTLR start "rule__Algorithme__Group__2__Impl"
    // InternalAlgo.g:476:1: rule__Algorithme__Group__2__Impl : ( '{' ) ;
    public final void rule__Algorithme__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:480:1: ( ( '{' ) )
            // InternalAlgo.g:481:1: ( '{' )
            {
            // InternalAlgo.g:481:1: ( '{' )
            // InternalAlgo.g:482:2: '{'
            {
             before(grammarAccess.getAlgorithmeAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAlgorithmeAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__2__Impl"


    // $ANTLR start "rule__Algorithme__Group__3"
    // InternalAlgo.g:491:1: rule__Algorithme__Group__3 : rule__Algorithme__Group__3__Impl rule__Algorithme__Group__4 ;
    public final void rule__Algorithme__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:495:1: ( rule__Algorithme__Group__3__Impl rule__Algorithme__Group__4 )
            // InternalAlgo.g:496:2: rule__Algorithme__Group__3__Impl rule__Algorithme__Group__4
            {
            pushFollow(FOLLOW_8);
            rule__Algorithme__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithme__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__3"


    // $ANTLR start "rule__Algorithme__Group__3__Impl"
    // InternalAlgo.g:503:1: rule__Algorithme__Group__3__Impl : ( 'documentation' ) ;
    public final void rule__Algorithme__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:507:1: ( ( 'documentation' ) )
            // InternalAlgo.g:508:1: ( 'documentation' )
            {
            // InternalAlgo.g:508:1: ( 'documentation' )
            // InternalAlgo.g:509:2: 'documentation'
            {
             before(grammarAccess.getAlgorithmeAccess().getDocumentationKeyword_3()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getAlgorithmeAccess().getDocumentationKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__3__Impl"


    // $ANTLR start "rule__Algorithme__Group__4"
    // InternalAlgo.g:518:1: rule__Algorithme__Group__4 : rule__Algorithme__Group__4__Impl rule__Algorithme__Group__5 ;
    public final void rule__Algorithme__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:522:1: ( rule__Algorithme__Group__4__Impl rule__Algorithme__Group__5 )
            // InternalAlgo.g:523:2: rule__Algorithme__Group__4__Impl rule__Algorithme__Group__5
            {
            pushFollow(FOLLOW_9);
            rule__Algorithme__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithme__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__4"


    // $ANTLR start "rule__Algorithme__Group__4__Impl"
    // InternalAlgo.g:530:1: rule__Algorithme__Group__4__Impl : ( ( rule__Algorithme__DocumentationAssignment_4 ) ) ;
    public final void rule__Algorithme__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:534:1: ( ( ( rule__Algorithme__DocumentationAssignment_4 ) ) )
            // InternalAlgo.g:535:1: ( ( rule__Algorithme__DocumentationAssignment_4 ) )
            {
            // InternalAlgo.g:535:1: ( ( rule__Algorithme__DocumentationAssignment_4 ) )
            // InternalAlgo.g:536:2: ( rule__Algorithme__DocumentationAssignment_4 )
            {
             before(grammarAccess.getAlgorithmeAccess().getDocumentationAssignment_4()); 
            // InternalAlgo.g:537:2: ( rule__Algorithme__DocumentationAssignment_4 )
            // InternalAlgo.g:537:3: rule__Algorithme__DocumentationAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Algorithme__DocumentationAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmeAccess().getDocumentationAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__4__Impl"


    // $ANTLR start "rule__Algorithme__Group__5"
    // InternalAlgo.g:545:1: rule__Algorithme__Group__5 : rule__Algorithme__Group__5__Impl rule__Algorithme__Group__6 ;
    public final void rule__Algorithme__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:549:1: ( rule__Algorithme__Group__5__Impl rule__Algorithme__Group__6 )
            // InternalAlgo.g:550:2: rule__Algorithme__Group__5__Impl rule__Algorithme__Group__6
            {
            pushFollow(FOLLOW_10);
            rule__Algorithme__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithme__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__5"


    // $ANTLR start "rule__Algorithme__Group__5__Impl"
    // InternalAlgo.g:557:1: rule__Algorithme__Group__5__Impl : ( 'ressource' ) ;
    public final void rule__Algorithme__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:561:1: ( ( 'ressource' ) )
            // InternalAlgo.g:562:1: ( 'ressource' )
            {
            // InternalAlgo.g:562:1: ( 'ressource' )
            // InternalAlgo.g:563:2: 'ressource'
            {
             before(grammarAccess.getAlgorithmeAccess().getRessourceKeyword_5()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getAlgorithmeAccess().getRessourceKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__5__Impl"


    // $ANTLR start "rule__Algorithme__Group__6"
    // InternalAlgo.g:572:1: rule__Algorithme__Group__6 : rule__Algorithme__Group__6__Impl rule__Algorithme__Group__7 ;
    public final void rule__Algorithme__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:576:1: ( rule__Algorithme__Group__6__Impl rule__Algorithme__Group__7 )
            // InternalAlgo.g:577:2: rule__Algorithme__Group__6__Impl rule__Algorithme__Group__7
            {
            pushFollow(FOLLOW_11);
            rule__Algorithme__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithme__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__6"


    // $ANTLR start "rule__Algorithme__Group__6__Impl"
    // InternalAlgo.g:584:1: rule__Algorithme__Group__6__Impl : ( ( rule__Algorithme__RessourceAssignment_6 ) ) ;
    public final void rule__Algorithme__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:588:1: ( ( ( rule__Algorithme__RessourceAssignment_6 ) ) )
            // InternalAlgo.g:589:1: ( ( rule__Algorithme__RessourceAssignment_6 ) )
            {
            // InternalAlgo.g:589:1: ( ( rule__Algorithme__RessourceAssignment_6 ) )
            // InternalAlgo.g:590:2: ( rule__Algorithme__RessourceAssignment_6 )
            {
             before(grammarAccess.getAlgorithmeAccess().getRessourceAssignment_6()); 
            // InternalAlgo.g:591:2: ( rule__Algorithme__RessourceAssignment_6 )
            // InternalAlgo.g:591:3: rule__Algorithme__RessourceAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Algorithme__RessourceAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getAlgorithmeAccess().getRessourceAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__6__Impl"


    // $ANTLR start "rule__Algorithme__Group__7"
    // InternalAlgo.g:599:1: rule__Algorithme__Group__7 : rule__Algorithme__Group__7__Impl rule__Algorithme__Group__8 ;
    public final void rule__Algorithme__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:603:1: ( rule__Algorithme__Group__7__Impl rule__Algorithme__Group__8 )
            // InternalAlgo.g:604:2: rule__Algorithme__Group__7__Impl rule__Algorithme__Group__8
            {
            pushFollow(FOLLOW_11);
            rule__Algorithme__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithme__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__7"


    // $ANTLR start "rule__Algorithme__Group__7__Impl"
    // InternalAlgo.g:611:1: rule__Algorithme__Group__7__Impl : ( ( rule__Algorithme__Group_7__0 )? ) ;
    public final void rule__Algorithme__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:615:1: ( ( ( rule__Algorithme__Group_7__0 )? ) )
            // InternalAlgo.g:616:1: ( ( rule__Algorithme__Group_7__0 )? )
            {
            // InternalAlgo.g:616:1: ( ( rule__Algorithme__Group_7__0 )? )
            // InternalAlgo.g:617:2: ( rule__Algorithme__Group_7__0 )?
            {
             before(grammarAccess.getAlgorithmeAccess().getGroup_7()); 
            // InternalAlgo.g:618:2: ( rule__Algorithme__Group_7__0 )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==25) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // InternalAlgo.g:618:3: rule__Algorithme__Group_7__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Algorithme__Group_7__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getAlgorithmeAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__7__Impl"


    // $ANTLR start "rule__Algorithme__Group__8"
    // InternalAlgo.g:626:1: rule__Algorithme__Group__8 : rule__Algorithme__Group__8__Impl ;
    public final void rule__Algorithme__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:630:1: ( rule__Algorithme__Group__8__Impl )
            // InternalAlgo.g:631:2: rule__Algorithme__Group__8__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Algorithme__Group__8__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__8"


    // $ANTLR start "rule__Algorithme__Group__8__Impl"
    // InternalAlgo.g:637:1: rule__Algorithme__Group__8__Impl : ( '}' ) ;
    public final void rule__Algorithme__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:641:1: ( ( '}' ) )
            // InternalAlgo.g:642:1: ( '}' )
            {
            // InternalAlgo.g:642:1: ( '}' )
            // InternalAlgo.g:643:2: '}'
            {
             before(grammarAccess.getAlgorithmeAccess().getRightCurlyBracketKeyword_8()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAlgorithmeAccess().getRightCurlyBracketKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group__8__Impl"


    // $ANTLR start "rule__Algorithme__Group_7__0"
    // InternalAlgo.g:653:1: rule__Algorithme__Group_7__0 : rule__Algorithme__Group_7__0__Impl rule__Algorithme__Group_7__1 ;
    public final void rule__Algorithme__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:657:1: ( rule__Algorithme__Group_7__0__Impl rule__Algorithme__Group_7__1 )
            // InternalAlgo.g:658:2: rule__Algorithme__Group_7__0__Impl rule__Algorithme__Group_7__1
            {
            pushFollow(FOLLOW_4);
            rule__Algorithme__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithme__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group_7__0"


    // $ANTLR start "rule__Algorithme__Group_7__0__Impl"
    // InternalAlgo.g:665:1: rule__Algorithme__Group_7__0__Impl : ( 'ports' ) ;
    public final void rule__Algorithme__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:669:1: ( ( 'ports' ) )
            // InternalAlgo.g:670:1: ( 'ports' )
            {
            // InternalAlgo.g:670:1: ( 'ports' )
            // InternalAlgo.g:671:2: 'ports'
            {
             before(grammarAccess.getAlgorithmeAccess().getPortsKeyword_7_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getAlgorithmeAccess().getPortsKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group_7__0__Impl"


    // $ANTLR start "rule__Algorithme__Group_7__1"
    // InternalAlgo.g:680:1: rule__Algorithme__Group_7__1 : rule__Algorithme__Group_7__1__Impl rule__Algorithme__Group_7__2 ;
    public final void rule__Algorithme__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:684:1: ( rule__Algorithme__Group_7__1__Impl rule__Algorithme__Group_7__2 )
            // InternalAlgo.g:685:2: rule__Algorithme__Group_7__1__Impl rule__Algorithme__Group_7__2
            {
            pushFollow(FOLLOW_12);
            rule__Algorithme__Group_7__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithme__Group_7__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group_7__1"


    // $ANTLR start "rule__Algorithme__Group_7__1__Impl"
    // InternalAlgo.g:692:1: rule__Algorithme__Group_7__1__Impl : ( '{' ) ;
    public final void rule__Algorithme__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:696:1: ( ( '{' ) )
            // InternalAlgo.g:697:1: ( '{' )
            {
            // InternalAlgo.g:697:1: ( '{' )
            // InternalAlgo.g:698:2: '{'
            {
             before(grammarAccess.getAlgorithmeAccess().getLeftCurlyBracketKeyword_7_1()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getAlgorithmeAccess().getLeftCurlyBracketKeyword_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group_7__1__Impl"


    // $ANTLR start "rule__Algorithme__Group_7__2"
    // InternalAlgo.g:707:1: rule__Algorithme__Group_7__2 : rule__Algorithme__Group_7__2__Impl rule__Algorithme__Group_7__3 ;
    public final void rule__Algorithme__Group_7__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:711:1: ( rule__Algorithme__Group_7__2__Impl rule__Algorithme__Group_7__3 )
            // InternalAlgo.g:712:2: rule__Algorithme__Group_7__2__Impl rule__Algorithme__Group_7__3
            {
            pushFollow(FOLLOW_12);
            rule__Algorithme__Group_7__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Algorithme__Group_7__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group_7__2"


    // $ANTLR start "rule__Algorithme__Group_7__2__Impl"
    // InternalAlgo.g:719:1: rule__Algorithme__Group_7__2__Impl : ( ( rule__Algorithme__PortAssignment_7_2 )* ) ;
    public final void rule__Algorithme__Group_7__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:723:1: ( ( ( rule__Algorithme__PortAssignment_7_2 )* ) )
            // InternalAlgo.g:724:1: ( ( rule__Algorithme__PortAssignment_7_2 )* )
            {
            // InternalAlgo.g:724:1: ( ( rule__Algorithme__PortAssignment_7_2 )* )
            // InternalAlgo.g:725:2: ( rule__Algorithme__PortAssignment_7_2 )*
            {
             before(grammarAccess.getAlgorithmeAccess().getPortAssignment_7_2()); 
            // InternalAlgo.g:726:2: ( rule__Algorithme__PortAssignment_7_2 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( ((LA6_0>=13 && LA6_0<=14)) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalAlgo.g:726:3: rule__Algorithme__PortAssignment_7_2
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__Algorithme__PortAssignment_7_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getAlgorithmeAccess().getPortAssignment_7_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group_7__2__Impl"


    // $ANTLR start "rule__Algorithme__Group_7__3"
    // InternalAlgo.g:734:1: rule__Algorithme__Group_7__3 : rule__Algorithme__Group_7__3__Impl ;
    public final void rule__Algorithme__Group_7__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:738:1: ( rule__Algorithme__Group_7__3__Impl )
            // InternalAlgo.g:739:2: rule__Algorithme__Group_7__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Algorithme__Group_7__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group_7__3"


    // $ANTLR start "rule__Algorithme__Group_7__3__Impl"
    // InternalAlgo.g:745:1: rule__Algorithme__Group_7__3__Impl : ( '}' ) ;
    public final void rule__Algorithme__Group_7__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:749:1: ( ( '}' ) )
            // InternalAlgo.g:750:1: ( '}' )
            {
            // InternalAlgo.g:750:1: ( '}' )
            // InternalAlgo.g:751:2: '}'
            {
             before(grammarAccess.getAlgorithmeAccess().getRightCurlyBracketKeyword_7_3()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getAlgorithmeAccess().getRightCurlyBracketKeyword_7_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__Group_7__3__Impl"


    // $ANTLR start "rule__Ressource__Group__0"
    // InternalAlgo.g:761:1: rule__Ressource__Group__0 : rule__Ressource__Group__0__Impl rule__Ressource__Group__1 ;
    public final void rule__Ressource__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:765:1: ( rule__Ressource__Group__0__Impl rule__Ressource__Group__1 )
            // InternalAlgo.g:766:2: rule__Ressource__Group__0__Impl rule__Ressource__Group__1
            {
            pushFollow(FOLLOW_14);
            rule__Ressource__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__0"


    // $ANTLR start "rule__Ressource__Group__0__Impl"
    // InternalAlgo.g:773:1: rule__Ressource__Group__0__Impl : ( ( rule__Ressource__TypeAssignment_0 ) ) ;
    public final void rule__Ressource__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:777:1: ( ( ( rule__Ressource__TypeAssignment_0 ) ) )
            // InternalAlgo.g:778:1: ( ( rule__Ressource__TypeAssignment_0 ) )
            {
            // InternalAlgo.g:778:1: ( ( rule__Ressource__TypeAssignment_0 ) )
            // InternalAlgo.g:779:2: ( rule__Ressource__TypeAssignment_0 )
            {
             before(grammarAccess.getRessourceAccess().getTypeAssignment_0()); 
            // InternalAlgo.g:780:2: ( rule__Ressource__TypeAssignment_0 )
            // InternalAlgo.g:780:3: rule__Ressource__TypeAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__TypeAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getTypeAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__0__Impl"


    // $ANTLR start "rule__Ressource__Group__1"
    // InternalAlgo.g:788:1: rule__Ressource__Group__1 : rule__Ressource__Group__1__Impl rule__Ressource__Group__2 ;
    public final void rule__Ressource__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:792:1: ( rule__Ressource__Group__1__Impl rule__Ressource__Group__2 )
            // InternalAlgo.g:793:2: rule__Ressource__Group__1__Impl rule__Ressource__Group__2
            {
            pushFollow(FOLLOW_8);
            rule__Ressource__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Ressource__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__1"


    // $ANTLR start "rule__Ressource__Group__1__Impl"
    // InternalAlgo.g:800:1: rule__Ressource__Group__1__Impl : ( 'path' ) ;
    public final void rule__Ressource__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:804:1: ( ( 'path' ) )
            // InternalAlgo.g:805:1: ( 'path' )
            {
            // InternalAlgo.g:805:1: ( 'path' )
            // InternalAlgo.g:806:2: 'path'
            {
             before(grammarAccess.getRessourceAccess().getPathKeyword_1()); 
            match(input,26,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getPathKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__1__Impl"


    // $ANTLR start "rule__Ressource__Group__2"
    // InternalAlgo.g:815:1: rule__Ressource__Group__2 : rule__Ressource__Group__2__Impl ;
    public final void rule__Ressource__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:819:1: ( rule__Ressource__Group__2__Impl )
            // InternalAlgo.g:820:2: rule__Ressource__Group__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__Group__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__2"


    // $ANTLR start "rule__Ressource__Group__2__Impl"
    // InternalAlgo.g:826:1: rule__Ressource__Group__2__Impl : ( ( rule__Ressource__EmplacementAssignment_2 ) ) ;
    public final void rule__Ressource__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:830:1: ( ( ( rule__Ressource__EmplacementAssignment_2 ) ) )
            // InternalAlgo.g:831:1: ( ( rule__Ressource__EmplacementAssignment_2 ) )
            {
            // InternalAlgo.g:831:1: ( ( rule__Ressource__EmplacementAssignment_2 ) )
            // InternalAlgo.g:832:2: ( rule__Ressource__EmplacementAssignment_2 )
            {
             before(grammarAccess.getRessourceAccess().getEmplacementAssignment_2()); 
            // InternalAlgo.g:833:2: ( rule__Ressource__EmplacementAssignment_2 )
            // InternalAlgo.g:833:3: rule__Ressource__EmplacementAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Ressource__EmplacementAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getRessourceAccess().getEmplacementAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__Group__2__Impl"


    // $ANTLR start "rule__Port__Group__0"
    // InternalAlgo.g:842:1: rule__Port__Group__0 : rule__Port__Group__0__Impl rule__Port__Group__1 ;
    public final void rule__Port__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:846:1: ( rule__Port__Group__0__Impl rule__Port__Group__1 )
            // InternalAlgo.g:847:2: rule__Port__Group__0__Impl rule__Port__Group__1
            {
            pushFollow(FOLLOW_15);
            rule__Port__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0"


    // $ANTLR start "rule__Port__Group__0__Impl"
    // InternalAlgo.g:854:1: rule__Port__Group__0__Impl : ( ( rule__Port__DirectionAssignment_0 ) ) ;
    public final void rule__Port__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:858:1: ( ( ( rule__Port__DirectionAssignment_0 ) ) )
            // InternalAlgo.g:859:1: ( ( rule__Port__DirectionAssignment_0 ) )
            {
            // InternalAlgo.g:859:1: ( ( rule__Port__DirectionAssignment_0 ) )
            // InternalAlgo.g:860:2: ( rule__Port__DirectionAssignment_0 )
            {
             before(grammarAccess.getPortAccess().getDirectionAssignment_0()); 
            // InternalAlgo.g:861:2: ( rule__Port__DirectionAssignment_0 )
            // InternalAlgo.g:861:3: rule__Port__DirectionAssignment_0
            {
            pushFollow(FOLLOW_2);
            rule__Port__DirectionAssignment_0();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getDirectionAssignment_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__0__Impl"


    // $ANTLR start "rule__Port__Group__1"
    // InternalAlgo.g:869:1: rule__Port__Group__1 : rule__Port__Group__1__Impl rule__Port__Group__2 ;
    public final void rule__Port__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:873:1: ( rule__Port__Group__1__Impl rule__Port__Group__2 )
            // InternalAlgo.g:874:2: rule__Port__Group__1__Impl rule__Port__Group__2
            {
            pushFollow(FOLLOW_15);
            rule__Port__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__1"


    // $ANTLR start "rule__Port__Group__1__Impl"
    // InternalAlgo.g:881:1: rule__Port__Group__1__Impl : ( ( rule__Port__ConstantAssignment_1 )? ) ;
    public final void rule__Port__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:885:1: ( ( ( rule__Port__ConstantAssignment_1 )? ) )
            // InternalAlgo.g:886:1: ( ( rule__Port__ConstantAssignment_1 )? )
            {
            // InternalAlgo.g:886:1: ( ( rule__Port__ConstantAssignment_1 )? )
            // InternalAlgo.g:887:2: ( rule__Port__ConstantAssignment_1 )?
            {
             before(grammarAccess.getPortAccess().getConstantAssignment_1()); 
            // InternalAlgo.g:888:2: ( rule__Port__ConstantAssignment_1 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==28) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalAlgo.g:888:3: rule__Port__ConstantAssignment_1
                    {
                    pushFollow(FOLLOW_2);
                    rule__Port__ConstantAssignment_1();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPortAccess().getConstantAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__1__Impl"


    // $ANTLR start "rule__Port__Group__2"
    // InternalAlgo.g:896:1: rule__Port__Group__2 : rule__Port__Group__2__Impl rule__Port__Group__3 ;
    public final void rule__Port__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:900:1: ( rule__Port__Group__2__Impl rule__Port__Group__3 )
            // InternalAlgo.g:901:2: rule__Port__Group__2__Impl rule__Port__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Port__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__2"


    // $ANTLR start "rule__Port__Group__2__Impl"
    // InternalAlgo.g:908:1: rule__Port__Group__2__Impl : ( ( rule__Port__NomAssignment_2 ) ) ;
    public final void rule__Port__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:912:1: ( ( ( rule__Port__NomAssignment_2 ) ) )
            // InternalAlgo.g:913:1: ( ( rule__Port__NomAssignment_2 ) )
            {
            // InternalAlgo.g:913:1: ( ( rule__Port__NomAssignment_2 ) )
            // InternalAlgo.g:914:2: ( rule__Port__NomAssignment_2 )
            {
             before(grammarAccess.getPortAccess().getNomAssignment_2()); 
            // InternalAlgo.g:915:2: ( rule__Port__NomAssignment_2 )
            // InternalAlgo.g:915:3: rule__Port__NomAssignment_2
            {
            pushFollow(FOLLOW_2);
            rule__Port__NomAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getNomAssignment_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__2__Impl"


    // $ANTLR start "rule__Port__Group__3"
    // InternalAlgo.g:923:1: rule__Port__Group__3 : rule__Port__Group__3__Impl rule__Port__Group__4 ;
    public final void rule__Port__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:927:1: ( rule__Port__Group__3__Impl rule__Port__Group__4 )
            // InternalAlgo.g:928:2: rule__Port__Group__3__Impl rule__Port__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Port__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Port__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__3"


    // $ANTLR start "rule__Port__Group__3__Impl"
    // InternalAlgo.g:935:1: rule__Port__Group__3__Impl : ( ':' ) ;
    public final void rule__Port__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:939:1: ( ( ':' ) )
            // InternalAlgo.g:940:1: ( ':' )
            {
            // InternalAlgo.g:940:1: ( ':' )
            // InternalAlgo.g:941:2: ':'
            {
             before(grammarAccess.getPortAccess().getColonKeyword_3()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getColonKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__3__Impl"


    // $ANTLR start "rule__Port__Group__4"
    // InternalAlgo.g:950:1: rule__Port__Group__4 : rule__Port__Group__4__Impl ;
    public final void rule__Port__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:954:1: ( rule__Port__Group__4__Impl )
            // InternalAlgo.g:955:2: rule__Port__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Port__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__4"


    // $ANTLR start "rule__Port__Group__4__Impl"
    // InternalAlgo.g:961:1: rule__Port__Group__4__Impl : ( ( rule__Port__TypeAssignment_4 ) ) ;
    public final void rule__Port__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:965:1: ( ( ( rule__Port__TypeAssignment_4 ) ) )
            // InternalAlgo.g:966:1: ( ( rule__Port__TypeAssignment_4 ) )
            {
            // InternalAlgo.g:966:1: ( ( rule__Port__TypeAssignment_4 ) )
            // InternalAlgo.g:967:2: ( rule__Port__TypeAssignment_4 )
            {
             before(grammarAccess.getPortAccess().getTypeAssignment_4()); 
            // InternalAlgo.g:968:2: ( rule__Port__TypeAssignment_4 )
            // InternalAlgo.g:968:3: rule__Port__TypeAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Port__TypeAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPortAccess().getTypeAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__Group__4__Impl"


    // $ANTLR start "rule__Catalogue__NomAssignment_1"
    // InternalAlgo.g:977:1: rule__Catalogue__NomAssignment_1 : ( RULE_ID ) ;
    public final void rule__Catalogue__NomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:981:1: ( ( RULE_ID ) )
            // InternalAlgo.g:982:2: ( RULE_ID )
            {
            // InternalAlgo.g:982:2: ( RULE_ID )
            // InternalAlgo.g:983:3: RULE_ID
            {
             before(grammarAccess.getCatalogueAccess().getNomIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getCatalogueAccess().getNomIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogue__NomAssignment_1"


    // $ANTLR start "rule__Catalogue__AlgorithmesAssignment_3"
    // InternalAlgo.g:992:1: rule__Catalogue__AlgorithmesAssignment_3 : ( ruleAlgorithme ) ;
    public final void rule__Catalogue__AlgorithmesAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:996:1: ( ( ruleAlgorithme ) )
            // InternalAlgo.g:997:2: ( ruleAlgorithme )
            {
            // InternalAlgo.g:997:2: ( ruleAlgorithme )
            // InternalAlgo.g:998:3: ruleAlgorithme
            {
             before(grammarAccess.getCatalogueAccess().getAlgorithmesAlgorithmeParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleAlgorithme();

            state._fsp--;

             after(grammarAccess.getCatalogueAccess().getAlgorithmesAlgorithmeParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Catalogue__AlgorithmesAssignment_3"


    // $ANTLR start "rule__Algorithme__NomAssignment_1"
    // InternalAlgo.g:1007:1: rule__Algorithme__NomAssignment_1 : ( RULE_ID ) ;
    public final void rule__Algorithme__NomAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:1011:1: ( ( RULE_ID ) )
            // InternalAlgo.g:1012:2: ( RULE_ID )
            {
            // InternalAlgo.g:1012:2: ( RULE_ID )
            // InternalAlgo.g:1013:3: RULE_ID
            {
             before(grammarAccess.getAlgorithmeAccess().getNomIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAlgorithmeAccess().getNomIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__NomAssignment_1"


    // $ANTLR start "rule__Algorithme__DocumentationAssignment_4"
    // InternalAlgo.g:1022:1: rule__Algorithme__DocumentationAssignment_4 : ( RULE_STRING ) ;
    public final void rule__Algorithme__DocumentationAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:1026:1: ( ( RULE_STRING ) )
            // InternalAlgo.g:1027:2: ( RULE_STRING )
            {
            // InternalAlgo.g:1027:2: ( RULE_STRING )
            // InternalAlgo.g:1028:3: RULE_STRING
            {
             before(grammarAccess.getAlgorithmeAccess().getDocumentationSTRINGTerminalRuleCall_4_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getAlgorithmeAccess().getDocumentationSTRINGTerminalRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__DocumentationAssignment_4"


    // $ANTLR start "rule__Algorithme__RessourceAssignment_6"
    // InternalAlgo.g:1037:1: rule__Algorithme__RessourceAssignment_6 : ( ruleRessource ) ;
    public final void rule__Algorithme__RessourceAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:1041:1: ( ( ruleRessource ) )
            // InternalAlgo.g:1042:2: ( ruleRessource )
            {
            // InternalAlgo.g:1042:2: ( ruleRessource )
            // InternalAlgo.g:1043:3: ruleRessource
            {
             before(grammarAccess.getAlgorithmeAccess().getRessourceRessourceParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleRessource();

            state._fsp--;

             after(grammarAccess.getAlgorithmeAccess().getRessourceRessourceParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__RessourceAssignment_6"


    // $ANTLR start "rule__Algorithme__PortAssignment_7_2"
    // InternalAlgo.g:1052:1: rule__Algorithme__PortAssignment_7_2 : ( rulePort ) ;
    public final void rule__Algorithme__PortAssignment_7_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:1056:1: ( ( rulePort ) )
            // InternalAlgo.g:1057:2: ( rulePort )
            {
            // InternalAlgo.g:1057:2: ( rulePort )
            // InternalAlgo.g:1058:3: rulePort
            {
             before(grammarAccess.getAlgorithmeAccess().getPortPortParserRuleCall_7_2_0()); 
            pushFollow(FOLLOW_2);
            rulePort();

            state._fsp--;

             after(grammarAccess.getAlgorithmeAccess().getPortPortParserRuleCall_7_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Algorithme__PortAssignment_7_2"


    // $ANTLR start "rule__Ressource__TypeAssignment_0"
    // InternalAlgo.g:1067:1: rule__Ressource__TypeAssignment_0 : ( ruleTypeRessource ) ;
    public final void rule__Ressource__TypeAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:1071:1: ( ( ruleTypeRessource ) )
            // InternalAlgo.g:1072:2: ( ruleTypeRessource )
            {
            // InternalAlgo.g:1072:2: ( ruleTypeRessource )
            // InternalAlgo.g:1073:3: ruleTypeRessource
            {
             before(grammarAccess.getRessourceAccess().getTypeTypeRessourceEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeRessource();

            state._fsp--;

             after(grammarAccess.getRessourceAccess().getTypeTypeRessourceEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__TypeAssignment_0"


    // $ANTLR start "rule__Ressource__EmplacementAssignment_2"
    // InternalAlgo.g:1082:1: rule__Ressource__EmplacementAssignment_2 : ( RULE_STRING ) ;
    public final void rule__Ressource__EmplacementAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:1086:1: ( ( RULE_STRING ) )
            // InternalAlgo.g:1087:2: ( RULE_STRING )
            {
            // InternalAlgo.g:1087:2: ( RULE_STRING )
            // InternalAlgo.g:1088:3: RULE_STRING
            {
             before(grammarAccess.getRessourceAccess().getEmplacementSTRINGTerminalRuleCall_2_0()); 
            match(input,RULE_STRING,FOLLOW_2); 
             after(grammarAccess.getRessourceAccess().getEmplacementSTRINGTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Ressource__EmplacementAssignment_2"


    // $ANTLR start "rule__Port__DirectionAssignment_0"
    // InternalAlgo.g:1097:1: rule__Port__DirectionAssignment_0 : ( ruleDirection ) ;
    public final void rule__Port__DirectionAssignment_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:1101:1: ( ( ruleDirection ) )
            // InternalAlgo.g:1102:2: ( ruleDirection )
            {
            // InternalAlgo.g:1102:2: ( ruleDirection )
            // InternalAlgo.g:1103:3: ruleDirection
            {
             before(grammarAccess.getPortAccess().getDirectionDirectionEnumRuleCall_0_0()); 
            pushFollow(FOLLOW_2);
            ruleDirection();

            state._fsp--;

             after(grammarAccess.getPortAccess().getDirectionDirectionEnumRuleCall_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__DirectionAssignment_0"


    // $ANTLR start "rule__Port__ConstantAssignment_1"
    // InternalAlgo.g:1112:1: rule__Port__ConstantAssignment_1 : ( ( 'constant' ) ) ;
    public final void rule__Port__ConstantAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:1116:1: ( ( ( 'constant' ) ) )
            // InternalAlgo.g:1117:2: ( ( 'constant' ) )
            {
            // InternalAlgo.g:1117:2: ( ( 'constant' ) )
            // InternalAlgo.g:1118:3: ( 'constant' )
            {
             before(grammarAccess.getPortAccess().getConstantConstantKeyword_1_0()); 
            // InternalAlgo.g:1119:3: ( 'constant' )
            // InternalAlgo.g:1120:4: 'constant'
            {
             before(grammarAccess.getPortAccess().getConstantConstantKeyword_1_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getConstantConstantKeyword_1_0()); 

            }

             after(grammarAccess.getPortAccess().getConstantConstantKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__ConstantAssignment_1"


    // $ANTLR start "rule__Port__NomAssignment_2"
    // InternalAlgo.g:1131:1: rule__Port__NomAssignment_2 : ( RULE_ID ) ;
    public final void rule__Port__NomAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:1135:1: ( ( RULE_ID ) )
            // InternalAlgo.g:1136:2: ( RULE_ID )
            {
            // InternalAlgo.g:1136:2: ( RULE_ID )
            // InternalAlgo.g:1137:3: RULE_ID
            {
             before(grammarAccess.getPortAccess().getNomIDTerminalRuleCall_2_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getPortAccess().getNomIDTerminalRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__NomAssignment_2"


    // $ANTLR start "rule__Port__TypeAssignment_4"
    // InternalAlgo.g:1146:1: rule__Port__TypeAssignment_4 : ( ruleTypeDonnees ) ;
    public final void rule__Port__TypeAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalAlgo.g:1150:1: ( ( ruleTypeDonnees ) )
            // InternalAlgo.g:1151:2: ( ruleTypeDonnees )
            {
            // InternalAlgo.g:1151:2: ( ruleTypeDonnees )
            // InternalAlgo.g:1152:3: ruleTypeDonnees
            {
             before(grammarAccess.getPortAccess().getTypeTypeDonneesEnumRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleTypeDonnees();

            state._fsp--;

             after(grammarAccess.getPortAccess().getTypeTypeDonneesEnumRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Port__TypeAssignment_4"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000002200000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000206000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000006002L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000010000010L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000078000L});

}