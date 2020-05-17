/* It implements a notepad using awt frame */
import java.awt.*;
import java.awt.event.*;
class menu extends Frame implements ActionListener{
    Frame f;
    FileDialog save_file,open_file;
    MenuBar m;
    Menu file,edit,format,view,help,save_as;
    MenuItem new_item,open_item,save,pdf,gif,doc,exit,cut,copy,paste,find,replace,wordwrap,font,zoom,view_help,about;
    CheckboxMenuItem status_bar;
    PopupMenu p;
    menu(){
        f = new Frame();
        f.setVisible(true);
        f.setLayout(null);
        f.setTitle("Notepad");
        f.setSize(500,500);
        m = new MenuBar();
        f.setMenuBar(m);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
    void add_file(){
        file = new Menu("File");
        m.add(file);
        new_item = new MenuItem("New");
        file.add(new_item);
        open_item = new MenuItem("Open");
        open_item.addActionListener(this);
        file.add(open_item);
        file.addSeparator();
        save = new MenuItem("Save");
        save.addActionListener(this);
        file.add(save);
        save_as = new Menu("Save As");
        file.add(save_as);
        pdf = new MenuItem("PDF");
        save_as.add(pdf);
        doc = new MenuItem("DOC");
        save_as.add(doc);
        gif = new MenuItem("GIF");
        save_as.add(gif);
        file.addSeparator();
        exit = new MenuItem("Exit");
        exit.addActionListener(this);
        file.add(exit);

        edit = new Menu("Edit");
        m.add(edit);
        cut = new MenuItem("Cut");
        edit.add(cut);
        copy = new MenuItem("Copy");
        edit.add(copy);
        paste = new MenuItem("Paste");
        edit.add(paste);
        edit.addSeparator();
        find = new MenuItem("Find");
        edit.add(find);
        replace = new MenuItem("Replace");
        edit.add(replace);

        format = new Menu("Format");
        m.add(format);
        wordwrap = new MenuItem("Word Wrap");
        format.add(wordwrap);
        font = new MenuItem("Font");
        format.add(font);

        view = new Menu("View");
        m.add(view);
        zoom = new MenuItem("Zoom");
        view.add(zoom);
        status_bar = new CheckboxMenuItem("Status Bar");
        view.add(status_bar);

        help = new Menu("Help");
        m.add(help);
        view_help = new MenuItem("View Help");
        help.add(view_help);
        about = new MenuItem("About notepad");
        help.add(about);

    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==open_item){
            open_file = new FileDialog(this,"Select File to open", FileDialog.LOAD);
            open_file.setVisible(true);
        }
        if(e.getSource()==save){
            save_file = new FileDialog(this,"Save File",FileDialog.SAVE);
            save_file.setVisible(true);
        }
        if(e.getSource()==exit){
            System.exit(0);
        }
    }
}
class notepad{
    public static void main(String a[]){
        menu m = new menu();
        m.add_file();
    }
}
