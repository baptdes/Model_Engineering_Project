package org.xtext.algorithme.algo.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.xtext.algorithme.algo.services.AlgoGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlgoParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'catalogue'", "'{'", "'}'", "'algorithm'", "'documentation'", "'ressource'", "'ports'", "'path'", "'constant'", "':'", "'Python'", "'Script'", "'Entree'", "'Sortie'", "'Entier'", "'Flottant'", "'Texte'", "'Booleen'"
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

        public InternalAlgoParser(TokenStream input, AlgoGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Catalogue";
       	}

       	@Override
       	protected AlgoGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCatalogue"
    // InternalAlgo.g:65:1: entryRuleCatalogue returns [EObject current=null] : iv_ruleCatalogue= ruleCatalogue EOF ;
    public final EObject entryRuleCatalogue() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCatalogue = null;


        try {
            // InternalAlgo.g:65:50: (iv_ruleCatalogue= ruleCatalogue EOF )
            // InternalAlgo.g:66:2: iv_ruleCatalogue= ruleCatalogue EOF
            {
             newCompositeNode(grammarAccess.getCatalogueRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCatalogue=ruleCatalogue();

            state._fsp--;

             current =iv_ruleCatalogue; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCatalogue"


    // $ANTLR start "ruleCatalogue"
    // InternalAlgo.g:72:1: ruleCatalogue returns [EObject current=null] : (otherlv_0= 'catalogue' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_algorithmes_3_0= ruleAlgorithme ) )* otherlv_4= '}' ) ;
    public final EObject ruleCatalogue() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nom_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_algorithmes_3_0 = null;



        	enterRule();

        try {
            // InternalAlgo.g:78:2: ( (otherlv_0= 'catalogue' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_algorithmes_3_0= ruleAlgorithme ) )* otherlv_4= '}' ) )
            // InternalAlgo.g:79:2: (otherlv_0= 'catalogue' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_algorithmes_3_0= ruleAlgorithme ) )* otherlv_4= '}' )
            {
            // InternalAlgo.g:79:2: (otherlv_0= 'catalogue' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_algorithmes_3_0= ruleAlgorithme ) )* otherlv_4= '}' )
            // InternalAlgo.g:80:3: otherlv_0= 'catalogue' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' ( (lv_algorithmes_3_0= ruleAlgorithme ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCatalogueAccess().getCatalogueKeyword_0());
            		
            // InternalAlgo.g:84:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalAlgo.g:85:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalAlgo.g:85:4: (lv_nom_1_0= RULE_ID )
            // InternalAlgo.g:86:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_nom_1_0, grammarAccess.getCatalogueAccess().getNomIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCatalogueRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCatalogueAccess().getLeftCurlyBracketKeyword_2());
            		
            // InternalAlgo.g:106:3: ( (lv_algorithmes_3_0= ruleAlgorithme ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalAlgo.g:107:4: (lv_algorithmes_3_0= ruleAlgorithme )
            	    {
            	    // InternalAlgo.g:107:4: (lv_algorithmes_3_0= ruleAlgorithme )
            	    // InternalAlgo.g:108:5: lv_algorithmes_3_0= ruleAlgorithme
            	    {

            	    					newCompositeNode(grammarAccess.getCatalogueAccess().getAlgorithmesAlgorithmeParserRuleCall_3_0());
            	    				
            	    pushFollow(FOLLOW_5);
            	    lv_algorithmes_3_0=ruleAlgorithme();

            	    state._fsp--;


            	    					if (current==null) {
            	    						current = createModelElementForParent(grammarAccess.getCatalogueRule());
            	    					}
            	    					add(
            	    						current,
            	    						"algorithmes",
            	    						lv_algorithmes_3_0,
            	    						"org.xtext.algorithme.algo.Algo.Algorithme");
            	    					afterParserOrEnumRuleCall();
            	    				

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_4=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_4, grammarAccess.getCatalogueAccess().getRightCurlyBracketKeyword_4());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCatalogue"


    // $ANTLR start "entryRuleAlgorithme"
    // InternalAlgo.g:133:1: entryRuleAlgorithme returns [EObject current=null] : iv_ruleAlgorithme= ruleAlgorithme EOF ;
    public final EObject entryRuleAlgorithme() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlgorithme = null;


        try {
            // InternalAlgo.g:133:51: (iv_ruleAlgorithme= ruleAlgorithme EOF )
            // InternalAlgo.g:134:2: iv_ruleAlgorithme= ruleAlgorithme EOF
            {
             newCompositeNode(grammarAccess.getAlgorithmeRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleAlgorithme=ruleAlgorithme();

            state._fsp--;

             current =iv_ruleAlgorithme; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlgorithme"


    // $ANTLR start "ruleAlgorithme"
    // InternalAlgo.g:140:1: ruleAlgorithme returns [EObject current=null] : (otherlv_0= 'algorithm' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) otherlv_5= 'ressource' ( (lv_ressource_6_0= ruleRessource ) ) (otherlv_7= 'ports' otherlv_8= '{' ( (lv_port_9_0= rulePort ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleAlgorithme() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_nom_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token lv_documentation_4_0=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        EObject lv_ressource_6_0 = null;

        EObject lv_port_9_0 = null;



        	enterRule();

        try {
            // InternalAlgo.g:146:2: ( (otherlv_0= 'algorithm' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) otherlv_5= 'ressource' ( (lv_ressource_6_0= ruleRessource ) ) (otherlv_7= 'ports' otherlv_8= '{' ( (lv_port_9_0= rulePort ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalAlgo.g:147:2: (otherlv_0= 'algorithm' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) otherlv_5= 'ressource' ( (lv_ressource_6_0= ruleRessource ) ) (otherlv_7= 'ports' otherlv_8= '{' ( (lv_port_9_0= rulePort ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalAlgo.g:147:2: (otherlv_0= 'algorithm' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) otherlv_5= 'ressource' ( (lv_ressource_6_0= ruleRessource ) ) (otherlv_7= 'ports' otherlv_8= '{' ( (lv_port_9_0= rulePort ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalAlgo.g:148:3: otherlv_0= 'algorithm' ( (lv_nom_1_0= RULE_ID ) ) otherlv_2= '{' otherlv_3= 'documentation' ( (lv_documentation_4_0= RULE_STRING ) ) otherlv_5= 'ressource' ( (lv_ressource_6_0= ruleRessource ) ) (otherlv_7= 'ports' otherlv_8= '{' ( (lv_port_9_0= rulePort ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,14,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getAlgorithmeAccess().getAlgorithmKeyword_0());
            		
            // InternalAlgo.g:152:3: ( (lv_nom_1_0= RULE_ID ) )
            // InternalAlgo.g:153:4: (lv_nom_1_0= RULE_ID )
            {
            // InternalAlgo.g:153:4: (lv_nom_1_0= RULE_ID )
            // InternalAlgo.g:154:5: lv_nom_1_0= RULE_ID
            {
            lv_nom_1_0=(Token)match(input,RULE_ID,FOLLOW_4); 

            					newLeafNode(lv_nom_1_0, grammarAccess.getAlgorithmeAccess().getNomIDTerminalRuleCall_1_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlgorithmeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_1_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_6); 

            			newLeafNode(otherlv_2, grammarAccess.getAlgorithmeAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_3, grammarAccess.getAlgorithmeAccess().getDocumentationKeyword_3());
            		
            // InternalAlgo.g:178:3: ( (lv_documentation_4_0= RULE_STRING ) )
            // InternalAlgo.g:179:4: (lv_documentation_4_0= RULE_STRING )
            {
            // InternalAlgo.g:179:4: (lv_documentation_4_0= RULE_STRING )
            // InternalAlgo.g:180:5: lv_documentation_4_0= RULE_STRING
            {
            lv_documentation_4_0=(Token)match(input,RULE_STRING,FOLLOW_8); 

            					newLeafNode(lv_documentation_4_0, grammarAccess.getAlgorithmeAccess().getDocumentationSTRINGTerminalRuleCall_4_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getAlgorithmeRule());
            					}
            					setWithLastConsumed(
            						current,
            						"documentation",
            						lv_documentation_4_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }

            otherlv_5=(Token)match(input,16,FOLLOW_9); 

            			newLeafNode(otherlv_5, grammarAccess.getAlgorithmeAccess().getRessourceKeyword_5());
            		
            // InternalAlgo.g:200:3: ( (lv_ressource_6_0= ruleRessource ) )
            // InternalAlgo.g:201:4: (lv_ressource_6_0= ruleRessource )
            {
            // InternalAlgo.g:201:4: (lv_ressource_6_0= ruleRessource )
            // InternalAlgo.g:202:5: lv_ressource_6_0= ruleRessource
            {

            					newCompositeNode(grammarAccess.getAlgorithmeAccess().getRessourceRessourceParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_10);
            lv_ressource_6_0=ruleRessource();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getAlgorithmeRule());
            					}
            					set(
            						current,
            						"ressource",
            						lv_ressource_6_0,
            						"org.xtext.algorithme.algo.Algo.Ressource");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgo.g:219:3: (otherlv_7= 'ports' otherlv_8= '{' ( (lv_port_9_0= rulePort ) )* otherlv_10= '}' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // InternalAlgo.g:220:4: otherlv_7= 'ports' otherlv_8= '{' ( (lv_port_9_0= rulePort ) )* otherlv_10= '}'
                    {
                    otherlv_7=(Token)match(input,17,FOLLOW_4); 

                    				newLeafNode(otherlv_7, grammarAccess.getAlgorithmeAccess().getPortsKeyword_7_0());
                    			
                    otherlv_8=(Token)match(input,12,FOLLOW_11); 

                    				newLeafNode(otherlv_8, grammarAccess.getAlgorithmeAccess().getLeftCurlyBracketKeyword_7_1());
                    			
                    // InternalAlgo.g:228:4: ( (lv_port_9_0= rulePort ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( ((LA2_0>=23 && LA2_0<=24)) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // InternalAlgo.g:229:5: (lv_port_9_0= rulePort )
                    	    {
                    	    // InternalAlgo.g:229:5: (lv_port_9_0= rulePort )
                    	    // InternalAlgo.g:230:6: lv_port_9_0= rulePort
                    	    {

                    	    						newCompositeNode(grammarAccess.getAlgorithmeAccess().getPortPortParserRuleCall_7_2_0());
                    	    					
                    	    pushFollow(FOLLOW_11);
                    	    lv_port_9_0=rulePort();

                    	    state._fsp--;


                    	    						if (current==null) {
                    	    							current = createModelElementForParent(grammarAccess.getAlgorithmeRule());
                    	    						}
                    	    						add(
                    	    							current,
                    	    							"port",
                    	    							lv_port_9_0,
                    	    							"org.xtext.algorithme.algo.Algo.Port");
                    	    						afterParserOrEnumRuleCall();
                    	    					

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,13,FOLLOW_12); 

                    				newLeafNode(otherlv_10, grammarAccess.getAlgorithmeAccess().getRightCurlyBracketKeyword_7_3());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,13,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getAlgorithmeAccess().getRightCurlyBracketKeyword_8());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlgorithme"


    // $ANTLR start "entryRuleRessource"
    // InternalAlgo.g:260:1: entryRuleRessource returns [EObject current=null] : iv_ruleRessource= ruleRessource EOF ;
    public final EObject entryRuleRessource() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRessource = null;


        try {
            // InternalAlgo.g:260:50: (iv_ruleRessource= ruleRessource EOF )
            // InternalAlgo.g:261:2: iv_ruleRessource= ruleRessource EOF
            {
             newCompositeNode(grammarAccess.getRessourceRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRessource=ruleRessource();

            state._fsp--;

             current =iv_ruleRessource; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRessource"


    // $ANTLR start "ruleRessource"
    // InternalAlgo.g:267:1: ruleRessource returns [EObject current=null] : ( ( (lv_type_0_0= ruleTypeRessource ) ) otherlv_1= 'path' ( (lv_emplacement_2_0= RULE_STRING ) ) ) ;
    public final EObject ruleRessource() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_emplacement_2_0=null;
        Enumerator lv_type_0_0 = null;



        	enterRule();

        try {
            // InternalAlgo.g:273:2: ( ( ( (lv_type_0_0= ruleTypeRessource ) ) otherlv_1= 'path' ( (lv_emplacement_2_0= RULE_STRING ) ) ) )
            // InternalAlgo.g:274:2: ( ( (lv_type_0_0= ruleTypeRessource ) ) otherlv_1= 'path' ( (lv_emplacement_2_0= RULE_STRING ) ) )
            {
            // InternalAlgo.g:274:2: ( ( (lv_type_0_0= ruleTypeRessource ) ) otherlv_1= 'path' ( (lv_emplacement_2_0= RULE_STRING ) ) )
            // InternalAlgo.g:275:3: ( (lv_type_0_0= ruleTypeRessource ) ) otherlv_1= 'path' ( (lv_emplacement_2_0= RULE_STRING ) )
            {
            // InternalAlgo.g:275:3: ( (lv_type_0_0= ruleTypeRessource ) )
            // InternalAlgo.g:276:4: (lv_type_0_0= ruleTypeRessource )
            {
            // InternalAlgo.g:276:4: (lv_type_0_0= ruleTypeRessource )
            // InternalAlgo.g:277:5: lv_type_0_0= ruleTypeRessource
            {

            					newCompositeNode(grammarAccess.getRessourceAccess().getTypeTypeRessourceEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_13);
            lv_type_0_0=ruleTypeRessource();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRessourceRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_0_0,
            						"org.xtext.algorithme.algo.Algo.TypeRessource");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,18,FOLLOW_7); 

            			newLeafNode(otherlv_1, grammarAccess.getRessourceAccess().getPathKeyword_1());
            		
            // InternalAlgo.g:298:3: ( (lv_emplacement_2_0= RULE_STRING ) )
            // InternalAlgo.g:299:4: (lv_emplacement_2_0= RULE_STRING )
            {
            // InternalAlgo.g:299:4: (lv_emplacement_2_0= RULE_STRING )
            // InternalAlgo.g:300:5: lv_emplacement_2_0= RULE_STRING
            {
            lv_emplacement_2_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

            					newLeafNode(lv_emplacement_2_0, grammarAccess.getRessourceAccess().getEmplacementSTRINGTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getRessourceRule());
            					}
            					setWithLastConsumed(
            						current,
            						"emplacement",
            						lv_emplacement_2_0,
            						"org.eclipse.xtext.common.Terminals.STRING");
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRessource"


    // $ANTLR start "entryRulePort"
    // InternalAlgo.g:320:1: entryRulePort returns [EObject current=null] : iv_rulePort= rulePort EOF ;
    public final EObject entryRulePort() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePort = null;


        try {
            // InternalAlgo.g:320:45: (iv_rulePort= rulePort EOF )
            // InternalAlgo.g:321:2: iv_rulePort= rulePort EOF
            {
             newCompositeNode(grammarAccess.getPortRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePort=rulePort();

            state._fsp--;

             current =iv_rulePort; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePort"


    // $ANTLR start "rulePort"
    // InternalAlgo.g:327:1: rulePort returns [EObject current=null] : ( ( (lv_direction_0_0= ruleDirection ) ) ( (lv_constant_1_0= 'constant' ) )? ( (lv_nom_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleTypeDonnees ) ) ) ;
    public final EObject rulePort() throws RecognitionException {
        EObject current = null;

        Token lv_constant_1_0=null;
        Token lv_nom_2_0=null;
        Token otherlv_3=null;
        Enumerator lv_direction_0_0 = null;

        Enumerator lv_type_4_0 = null;



        	enterRule();

        try {
            // InternalAlgo.g:333:2: ( ( ( (lv_direction_0_0= ruleDirection ) ) ( (lv_constant_1_0= 'constant' ) )? ( (lv_nom_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleTypeDonnees ) ) ) )
            // InternalAlgo.g:334:2: ( ( (lv_direction_0_0= ruleDirection ) ) ( (lv_constant_1_0= 'constant' ) )? ( (lv_nom_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleTypeDonnees ) ) )
            {
            // InternalAlgo.g:334:2: ( ( (lv_direction_0_0= ruleDirection ) ) ( (lv_constant_1_0= 'constant' ) )? ( (lv_nom_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleTypeDonnees ) ) )
            // InternalAlgo.g:335:3: ( (lv_direction_0_0= ruleDirection ) ) ( (lv_constant_1_0= 'constant' ) )? ( (lv_nom_2_0= RULE_ID ) ) otherlv_3= ':' ( (lv_type_4_0= ruleTypeDonnees ) )
            {
            // InternalAlgo.g:335:3: ( (lv_direction_0_0= ruleDirection ) )
            // InternalAlgo.g:336:4: (lv_direction_0_0= ruleDirection )
            {
            // InternalAlgo.g:336:4: (lv_direction_0_0= ruleDirection )
            // InternalAlgo.g:337:5: lv_direction_0_0= ruleDirection
            {

            					newCompositeNode(grammarAccess.getPortAccess().getDirectionDirectionEnumRuleCall_0_0());
            				
            pushFollow(FOLLOW_14);
            lv_direction_0_0=ruleDirection();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortRule());
            					}
            					set(
            						current,
            						"direction",
            						lv_direction_0_0,
            						"org.xtext.algorithme.algo.Algo.Direction");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalAlgo.g:354:3: ( (lv_constant_1_0= 'constant' ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==19) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // InternalAlgo.g:355:4: (lv_constant_1_0= 'constant' )
                    {
                    // InternalAlgo.g:355:4: (lv_constant_1_0= 'constant' )
                    // InternalAlgo.g:356:5: lv_constant_1_0= 'constant'
                    {
                    lv_constant_1_0=(Token)match(input,19,FOLLOW_3); 

                    					newLeafNode(lv_constant_1_0, grammarAccess.getPortAccess().getConstantConstantKeyword_1_0());
                    				

                    					if (current==null) {
                    						current = createModelElement(grammarAccess.getPortRule());
                    					}
                    					setWithLastConsumed(current, "constant", lv_constant_1_0 != null, "constant");
                    				

                    }


                    }
                    break;

            }

            // InternalAlgo.g:368:3: ( (lv_nom_2_0= RULE_ID ) )
            // InternalAlgo.g:369:4: (lv_nom_2_0= RULE_ID )
            {
            // InternalAlgo.g:369:4: (lv_nom_2_0= RULE_ID )
            // InternalAlgo.g:370:5: lv_nom_2_0= RULE_ID
            {
            lv_nom_2_0=(Token)match(input,RULE_ID,FOLLOW_15); 

            					newLeafNode(lv_nom_2_0, grammarAccess.getPortAccess().getNomIDTerminalRuleCall_2_0());
            				

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPortRule());
            					}
            					setWithLastConsumed(
            						current,
            						"nom",
            						lv_nom_2_0,
            						"org.eclipse.xtext.common.Terminals.ID");
            				

            }


            }

            otherlv_3=(Token)match(input,20,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getPortAccess().getColonKeyword_3());
            		
            // InternalAlgo.g:390:3: ( (lv_type_4_0= ruleTypeDonnees ) )
            // InternalAlgo.g:391:4: (lv_type_4_0= ruleTypeDonnees )
            {
            // InternalAlgo.g:391:4: (lv_type_4_0= ruleTypeDonnees )
            // InternalAlgo.g:392:5: lv_type_4_0= ruleTypeDonnees
            {

            					newCompositeNode(grammarAccess.getPortAccess().getTypeTypeDonneesEnumRuleCall_4_0());
            				
            pushFollow(FOLLOW_2);
            lv_type_4_0=ruleTypeDonnees();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPortRule());
            					}
            					set(
            						current,
            						"type",
            						lv_type_4_0,
            						"org.xtext.algorithme.algo.Algo.TypeDonnees");
            					afterParserOrEnumRuleCall();
            				

            }


            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePort"


    // $ANTLR start "ruleTypeRessource"
    // InternalAlgo.g:413:1: ruleTypeRessource returns [Enumerator current=null] : ( (enumLiteral_0= 'Python' ) | (enumLiteral_1= 'Script' ) ) ;
    public final Enumerator ruleTypeRessource() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAlgo.g:419:2: ( ( (enumLiteral_0= 'Python' ) | (enumLiteral_1= 'Script' ) ) )
            // InternalAlgo.g:420:2: ( (enumLiteral_0= 'Python' ) | (enumLiteral_1= 'Script' ) )
            {
            // InternalAlgo.g:420:2: ( (enumLiteral_0= 'Python' ) | (enumLiteral_1= 'Script' ) )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==21) ) {
                alt5=1;
            }
            else if ( (LA5_0==22) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // InternalAlgo.g:421:3: (enumLiteral_0= 'Python' )
                    {
                    // InternalAlgo.g:421:3: (enumLiteral_0= 'Python' )
                    // InternalAlgo.g:422:4: enumLiteral_0= 'Python'
                    {
                    enumLiteral_0=(Token)match(input,21,FOLLOW_2); 

                    				current = grammarAccess.getTypeRessourceAccess().getPythonEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeRessourceAccess().getPythonEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlgo.g:429:3: (enumLiteral_1= 'Script' )
                    {
                    // InternalAlgo.g:429:3: (enumLiteral_1= 'Script' )
                    // InternalAlgo.g:430:4: enumLiteral_1= 'Script'
                    {
                    enumLiteral_1=(Token)match(input,22,FOLLOW_2); 

                    				current = grammarAccess.getTypeRessourceAccess().getScriptEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeRessourceAccess().getScriptEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeRessource"


    // $ANTLR start "ruleDirection"
    // InternalAlgo.g:440:1: ruleDirection returns [Enumerator current=null] : ( (enumLiteral_0= 'Entree' ) | (enumLiteral_1= 'Sortie' ) ) ;
    public final Enumerator ruleDirection() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;


        	enterRule();

        try {
            // InternalAlgo.g:446:2: ( ( (enumLiteral_0= 'Entree' ) | (enumLiteral_1= 'Sortie' ) ) )
            // InternalAlgo.g:447:2: ( (enumLiteral_0= 'Entree' ) | (enumLiteral_1= 'Sortie' ) )
            {
            // InternalAlgo.g:447:2: ( (enumLiteral_0= 'Entree' ) | (enumLiteral_1= 'Sortie' ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            else if ( (LA6_0==24) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalAlgo.g:448:3: (enumLiteral_0= 'Entree' )
                    {
                    // InternalAlgo.g:448:3: (enumLiteral_0= 'Entree' )
                    // InternalAlgo.g:449:4: enumLiteral_0= 'Entree'
                    {
                    enumLiteral_0=(Token)match(input,23,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getEntreeEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getDirectionAccess().getEntreeEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlgo.g:456:3: (enumLiteral_1= 'Sortie' )
                    {
                    // InternalAlgo.g:456:3: (enumLiteral_1= 'Sortie' )
                    // InternalAlgo.g:457:4: enumLiteral_1= 'Sortie'
                    {
                    enumLiteral_1=(Token)match(input,24,FOLLOW_2); 

                    				current = grammarAccess.getDirectionAccess().getSortieEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getDirectionAccess().getSortieEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDirection"


    // $ANTLR start "ruleTypeDonnees"
    // InternalAlgo.g:467:1: ruleTypeDonnees returns [Enumerator current=null] : ( (enumLiteral_0= 'Entier' ) | (enumLiteral_1= 'Flottant' ) | (enumLiteral_2= 'Texte' ) | (enumLiteral_3= 'Booleen' ) ) ;
    public final Enumerator ruleTypeDonnees() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;


        	enterRule();

        try {
            // InternalAlgo.g:473:2: ( ( (enumLiteral_0= 'Entier' ) | (enumLiteral_1= 'Flottant' ) | (enumLiteral_2= 'Texte' ) | (enumLiteral_3= 'Booleen' ) ) )
            // InternalAlgo.g:474:2: ( (enumLiteral_0= 'Entier' ) | (enumLiteral_1= 'Flottant' ) | (enumLiteral_2= 'Texte' ) | (enumLiteral_3= 'Booleen' ) )
            {
            // InternalAlgo.g:474:2: ( (enumLiteral_0= 'Entier' ) | (enumLiteral_1= 'Flottant' ) | (enumLiteral_2= 'Texte' ) | (enumLiteral_3= 'Booleen' ) )
            int alt7=4;
            switch ( input.LA(1) ) {
            case 25:
                {
                alt7=1;
                }
                break;
            case 26:
                {
                alt7=2;
                }
                break;
            case 27:
                {
                alt7=3;
                }
                break;
            case 28:
                {
                alt7=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // InternalAlgo.g:475:3: (enumLiteral_0= 'Entier' )
                    {
                    // InternalAlgo.g:475:3: (enumLiteral_0= 'Entier' )
                    // InternalAlgo.g:476:4: enumLiteral_0= 'Entier'
                    {
                    enumLiteral_0=(Token)match(input,25,FOLLOW_2); 

                    				current = grammarAccess.getTypeDonneesAccess().getEntierEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_0, grammarAccess.getTypeDonneesAccess().getEntierEnumLiteralDeclaration_0());
                    			

                    }


                    }
                    break;
                case 2 :
                    // InternalAlgo.g:483:3: (enumLiteral_1= 'Flottant' )
                    {
                    // InternalAlgo.g:483:3: (enumLiteral_1= 'Flottant' )
                    // InternalAlgo.g:484:4: enumLiteral_1= 'Flottant'
                    {
                    enumLiteral_1=(Token)match(input,26,FOLLOW_2); 

                    				current = grammarAccess.getTypeDonneesAccess().getFlottantEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_1, grammarAccess.getTypeDonneesAccess().getFlottantEnumLiteralDeclaration_1());
                    			

                    }


                    }
                    break;
                case 3 :
                    // InternalAlgo.g:491:3: (enumLiteral_2= 'Texte' )
                    {
                    // InternalAlgo.g:491:3: (enumLiteral_2= 'Texte' )
                    // InternalAlgo.g:492:4: enumLiteral_2= 'Texte'
                    {
                    enumLiteral_2=(Token)match(input,27,FOLLOW_2); 

                    				current = grammarAccess.getTypeDonneesAccess().getTexteEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_2, grammarAccess.getTypeDonneesAccess().getTexteEnumLiteralDeclaration_2());
                    			

                    }


                    }
                    break;
                case 4 :
                    // InternalAlgo.g:499:3: (enumLiteral_3= 'Booleen' )
                    {
                    // InternalAlgo.g:499:3: (enumLiteral_3= 'Booleen' )
                    // InternalAlgo.g:500:4: enumLiteral_3= 'Booleen'
                    {
                    enumLiteral_3=(Token)match(input,28,FOLLOW_2); 

                    				current = grammarAccess.getTypeDonneesAccess().getBooleenEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                    				newLeafNode(enumLiteral_3, grammarAccess.getTypeDonneesAccess().getBooleenEnumLiteralDeclaration_3());
                    			

                    }


                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleTypeDonnees"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000600000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000022000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000001802000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080010L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x000000001E000000L});

}