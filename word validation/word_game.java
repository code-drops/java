/* It implements a a word game that validates that the word should have 2 or 3 alphabets and is valid in dictionary */

import java.awt.*;
import java.awt.event.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowListener;

class word extends Frame implements ActionListener{
    Frame frame;
    String[] words;
    String str="";
    Dialog dg;
    Panel p1,p2;
    TextField t1;
    GridLayout grid;
    Button a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z,check,clear,exit;
    word(){
        frame = new Frame();
        frame.setLocation(0,0);
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setVisible(true);
        String newstr= "AD AI AM AN AS AT BE BI DO ED EX GO HA HE HI ID IF IN IS IT ME MI MY OF OH OM ON OR OX PI SO TO UP US WE YO ABS ACE ACT ADO ADS AGE AGO AID AIM AIR AND ANT ANY APE ARC ARE ARM ART ASH ASK ATE AXE BAD BAG BAN BAR BAT BAY BED BEG BEN BET BEY BIB BID BIG BIN BIO BIS BIT BIZ BOA BOB BOD BOG BOO BOP BOS BOT BOW BOX BOY BRA BRO BRR BUB BUD BUG BUM BUN BUR BUS BUT BUY BYE BYS CAB CAD CAM CAN CAP CAR CAT CAW CAY CEE CEL CEP CHI CIG CIS COB COD COG COL CON COO COP COR COS COT COW COX COY COZ CRU CRY CUB CUD CUE CUM CUP CUR CUT CWM DAB DAD DAG DAH DAK DAL DAM DAN DAP DAW DAY DEB DEE DEF DEL DEN DEV DEW DEX DEY DIB DID DIE DIF DIG DIM DIN DIP DIS DIT DOC DOE DOG DOL DOM DON DOR DOS DOT DOW DRY DUB DUD DUE DUG DUH DUI DUN DUO DUP DYE EAR EAT EAU EBB ECU EDH EDS EEK EEL EFF EFS EFT EGG EGO EKE ELD ELF ELK ELL ELM ELS EME EMS EMU END ENG ENS EON ERA ERE ERG ERN ERR ERS ESS ETA ETH EVE EWE EYE FAB FAD FAG FAN FAR FAS FAT FAX FAY FED FEE FEH FEM FEN FER FES FET FEU FEW FEY FEZ FIB FID FIE FIG FIL FIN FIR FIT FIX FIZ FLU FLY FOB FOE FOG FOH FON FOP FOR FOU FOX FOY FRO FRY FUB FUD FUG FUN GAB GAD GAE GAG GAL GAM GAN GAP GAR GAS GAT GAY GED GEE GEL GEM GEN GET GEY GHI GIB GID GIE GIG GIN GIP GIT GNU GOA GOB GOD GOO GOR GOS GOT GOX GOY GUL GUM GUN GUT GUV GUY GYM GYP HAD HAE HAG HAH HAJ HAM HAO HAP HAS HAT HAW HAY HEH HEM HEN HEP HER HES HET HEW HEX HEY HIC HID HIE HIM HIN HIP HIS HIT HMM HOB HOD HOE HOG HON HOP HOS HOT HOW HOY HUB HUE HUG HUH HUM HUN HUP HUT HYP ICE ICH ICK ICY IDS IFF IFS IGG ILK ILL IMP INK INN INS ION IRE IRK ISM ITS IVY JAB JAG JAM JAR JAW JAY JEE JET JEU JEW JIB JIG JIN JOB JOE JOG JOT JOW JOY JUG JUN JUS JUT KAB KAE KAF KAS KAT KAY KEA KEF KEG KEN KEP KEX KEY KHI KID KIF KIN KIP KIR KIS KIT KOA KOB KOI KOP KOR KOS KUE KYE LAB LAC LAD LAG LAM LAP LAR LAS LAT LAV LAW LAX LAY LEA LED LEE LEG LEI LEK LES LET LEU LEV LEX LEY LEZ LIB LID LIE LIN LIP LIS LIT LOB LOG LOO LOP LOT LOW LOX LUG LUM LUV LUX LYE MAC MAD MAE MAG MAN MAP MAR MAS MAT MAW MAX MAY MED MEG MEL MEM MEN MET MEW MHO MIB MIC MID MIG MIL MIM MIR MIS MIX MOA MOB MOC MOD MOG MOL MOM MON MOO MOP MOR MOS MOT MOW MUD MUG MUM MUN MUS MUT MYC NAB NAE NAG NAH NAM NAN NAP NAW NAY NEB NEE NEG NET NEW NIB NIL NIM NIP NIT NIX NOB NOD NOG NOH NOM NOO NOR NOS NOT NOW NTH NUB NUN NUS NUT OAF OAK OAR OAT OBA OBE OBI OCA ODA ODD ODE ODS OES OFF OFT OHM OHO OHS OIL OKA OKE OLD OLE OMS ONE ONO ONS OOH OOT OPE OPS OPT ORA ORB ORC ORE ORS ORT OSE OUD OUR OUT OVA OWE OWL OWN OXO OXY PAC PAD PAH PAL PAM PAN PAP PAR PAS PAT PAW PAX PAY PEA PEC PED PEE PEG PEH PEN PEP PER PES PET PEW PHI PHT PIA PIC PIE PIG PIN PIP PIS PIT PIU PIX PLY POD POH POI POL POM POO POP POT POW POX PRO PRY PSI PST PUB PUD PUG PUL PUN PUP PUR PUS PUT PYA PYE PYX QAT QIS QUA RAD RAG RAH RAI RAJ RAM RAN RAP RAS RAT RAW RAX RAY REB REC RED REF REG  REP RES RET REV  RIA RIB RID RIF RIG RIM RIN RIP ROB ROD ROM ROW RUM SAD SAP SAT SAW SAY SEA SEC SET SEX SHE SHY SIM SIN SIP SIR SIT SIX SKI SKY SPA SPY SUB SUM SUN TAB TAG TAM TAN TAO TAP TAX TEA TED TEN THE TIE TIN TIP TOE TOM TON TOP TOW TOY TRY TWO VAN VAR VIM VOW VOX WAN WAR WAS WAX WAY WEB WED WET WHO WHY WIG WIN YAK YAP YEH YES YOU YUP ZIG ZIP";
        words = newstr.split(" ");
    }
    void add_panels(){
        p1 = new Panel();
        frame.add(p1);
        p1.setBounds(0,0,600,100);
        p1.setBackground(Color.CYAN);
        p1.setLayout(null);
        t1= new TextField();
        t1.setBounds(50,50,500,50);
        p1.add(t1);

        p2 = new Panel();
        grid = new GridLayout(6,5);
        p2.setLayout(grid);
        p2.setBackground(Color.PINK);
        p2.setBounds(0,100,600,500);
        frame.add(p2);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    void add_button(){
        a = new Button("A");
        a.addActionListener(this);
        p2.add(a);
        b = new Button("B");
        b.addActionListener(this);
        p2.add(b);
        c = new Button("C");
        c.addActionListener(this);
        p2.add(c);
        d = new Button("D");
        d.addActionListener(this);
        p2.add(d);
        e = new Button("E");
        e.addActionListener(this);
        p2.add(e);
        f = new Button("F");
        f.addActionListener(this);
        p2.add(f);
        g = new Button("G");
        g.addActionListener(this);
        p2.add(g);
        h = new Button("H");
        h.addActionListener(this);
        p2.add(h);
        i = new Button("I");
        i.addActionListener(this);
        p2.add(i);
        j = new Button("J");
        j.addActionListener(this);
        p2.add(j);
        k = new Button("K");
        k.addActionListener(this);
        p2.add(k);
        l = new Button("L");
        l.addActionListener(this);
        p2.add(l);
        m = new Button("M");
        m.addActionListener(this);
        p2.add(m);
        n = new Button("N");
        n.addActionListener(this);
        p2.add(n);
        o = new Button("O");
        o.addActionListener(this);
        p2.add(o);
        p = new Button("P");
        p.addActionListener(this);
        p2.add(p);
        q = new Button("Q");
        q.addActionListener(this);
        p2.add(q);
        r = new Button("R");
        r.addActionListener(this);
        p2.add(r);
        s = new Button("S");
        s.addActionListener(this);
        p2.add(s);
        t = new Button("T");
        t.addActionListener(this);
        p2.add(t);
        u = new Button("U");
        u.addActionListener(this);
        p2.add(u);
        v = new Button("V");
        v.addActionListener(this);
        p2.add(v);
        w = new Button("W");
        w.addActionListener(this);
        p2.add(w);
        x = new Button("X");
        x.addActionListener(this);
        p2.add(x);
        y = new Button("Y");
        y.addActionListener(this);
        p2.add(y);
        z = new Button("Z");
        z.addActionListener(this);
        p2.add(z);
        check = new Button("check");
        check.addActionListener(this);
        p2.add(check);
        clear = new Button("clear");
        clear.addActionListener(this);
        p2.add(clear);
        exit = new Button("exit");
        exit.addActionListener(this);
        p2.add(exit);
    }
    void disable_button(){
        a.setEnabled(true);
        b.setEnabled(true);
        c.setEnabled(true);
        d.setEnabled(true);
        e.setEnabled(true);
        f.setEnabled(true);
        g.setEnabled(true);
        h.setEnabled(true);
        i.setEnabled(true);
        j.setEnabled(true);
        k.setEnabled(true);
        l.setEnabled(true);
        m.setEnabled(true);
        n.setEnabled(true);
        o.setEnabled(true);
        p.setEnabled(true);
        q.setEnabled(true);
        r.setEnabled(true);
        s.setEnabled(true);
        t.setEnabled(true);
        u.setEnabled(true);
        v.setEnabled(true);
        w.setEnabled(true);
        x.setEnabled(true);
        y.setEnabled(true);
        z.setEnabled(true);
    }

    @Override
    public void actionPerformed(ActionEvent e1) {
        if(e1.getSource()==clear){
            t1.setText("");
            disable_button();
            str = "";
        }
        if(e1.getSource()==exit){
            System.exit(0);
        }
        if(e1.getSource()==a){
            str = t1.getText() + 'A';
            a.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==b){
            str = t1.getText() + 'B';
            b.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==c){
            str = t1.getText() + 'C';
            c.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==d){
            str = t1.getText() + 'D';
            d.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==e){
            str = t1.getText() + 'E';
            e.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==f){
            str = t1.getText() + 'F';
            f.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==g){
            str = t1.getText() + 'G';
            g.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==h){
            str = t1.getText() + 'H';
            h.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==i){
            str = t1.getText() + 'I';
            i.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==j){
            str = t1.getText() + 'J';
            j.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==k){
            str = t1.getText() + 'K';
            k.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==l){
            str = t1.getText() + 'L';
            l.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==m){
            str = t1.getText() + 'M';
            m.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==n){
            str = t1.getText() + 'N';
            n.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==o){
            str = t1.getText() + 'O';
            o.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==p){
            str = t1.getText() + 'P';
            p.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==q){
            str = t1.getText() + 'Q';
            q.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==r){
            str = t1.getText() + 'R';
            r.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==s){
            str = t1.getText() + 'S';
            s.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==t){
            str = t1.getText() + 'T';
            t.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==u){
            str = t1.getText() + 'U';
            u.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==v){
            str = t1.getText() + 'V';
            v.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==w){
            str = t1.getText() + 'W';
            w.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==x){
            str = t1.getText() + 'X';
            x.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==y){
            str = t1.getText() + 'Y';
            y.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==z){
            str = t1.getText() + 'Z';
            z.setEnabled(false);
            t1.setText(str);
        }
        if(e1.getSource()==check){
            boolean flag = false;
            if(str.length()==2 || str.length()==3){
                for (String s:words
                     ) {
                    if(str.compareTo(s)==0){
                        flag = true;
                    }
                }
                if(flag==true){
                    dg = new Dialog(frame,"",false);
                    dg.setVisible(true);
                    dg.setBounds(100,100,200,200);
                    dg.setLayout(null);
                    dg.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosing(WindowEvent e) {
                            dg.setVisible(false);
                        }
                    });
                    Label warning = new Label("Valid");
                    warning.setBounds(45,50,150,20);
                    Button ok = new Button("OK");
                    dg.add(ok);
                    ok.setBounds(70,100,50,50);
                    ok.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dg.setVisible(false);
                        }
                    });
                    dg.add(warning);
                }else{
                    dg = new Dialog(frame,"",false);
                    dg.setVisible(true);
                    dg.setBounds(100,100,200,200);
                    dg.setLayout(null);
                    dg.addWindowListener(new WindowAdapter() {
                        @Override
                        public void windowClosing(WindowEvent e) {
                            dg.setVisible(false);
                        }
                    });
                    Label warning = new Label("Not a word");
                    warning.setBounds(45,50,150,20);
                    Button ok = new Button("OK");
                    dg.add(ok);
                    ok.setBounds(70,100,50,50);
                    ok.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            dg.setVisible(false);
                        }
                    });
                    dg.add(warning);
                }
            }
            else{
                dg = new Dialog(frame,"",false);
                dg.setVisible(true);
                dg.setBounds(100,100,200,200);
                dg.setLayout(null);
                dg.addWindowListener(new WindowAdapter() {
                    @Override
                    public void windowClosing(WindowEvent e) {
                        dg.setVisible(false);
                    }
                });
                Label warning = new Label("Only 2 or  3 alphabets allowed");
                warning.setBounds(45,50,150,20);
                Button ok = new Button("OK");
                dg.add(ok);
                ok.setBounds(70,100,50,50);
                ok.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        dg.setVisible(false);
                    }
                });
                dg.add(warning);
            }
        }
    }
}
public class word_game {
    public static void main(String[] a){
        word w = new word();
        w.add_panels();
        w.add_button();
    }
}
