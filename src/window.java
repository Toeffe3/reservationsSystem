import java.awt.Dimension;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Victor
 */
public final class window extends javax.swing.JFrame {

    /**
     * Creates new form window
     */
    public window() {
        initComponents();
        start();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pages = new javax.swing.JTabbedPane();
        selectMovie = new javax.swing.JPanel();
        findSeatButton = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        selTime = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        selCinnema = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        selMovie = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        selectSeat = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        seatSel = new javax.swing.JTable();
        continueToPaymentButton1 = new javax.swing.JButton();
        continueToPaymentButton2 = new javax.swing.JButton();
        pay = new javax.swing.JPanel();
        tickets = new javax.swing.JScrollPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pages.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                pagesFocusGained(evt);
            }
        });

        findSeatButton.setText("Find plads");
        findSeatButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findSeatButtonActionPerformed(evt);
            }
        });

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Pris");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("180 kr.");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("100 kr.");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("5 kr.");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Voksen");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Vælg film");

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText("Barn");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Vælg tid");

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText("Resever");

        selTime.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        selTime.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                selTimeValueChanged(evt);
            }
        });
        jScrollPane2.setViewportView(selTime);

        selCinnema.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        selCinnema.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                selCinnemaValueChanged(evt);
            }
        });
        jScrollPane3.setViewportView(selCinnema);

        selMovie.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        selMovie.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                selMovieValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(selMovie);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Vælg biograf");

        javax.swing.GroupLayout selectMovieLayout = new javax.swing.GroupLayout(selectMovie);
        selectMovie.setLayout(selectMovieLayout);
        selectMovieLayout.setHorizontalGroup(
            selectMovieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectMovieLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(selectMovieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(selectMovieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(selectMovieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(selectMovieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(selectMovieLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(selectMovieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(selectMovieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(findSeatButton, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))
                .addContainerGap())
        );
        selectMovieLayout.setVerticalGroup(
            selectMovieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectMovieLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(selectMovieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(selectMovieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, selectMovieLayout.createSequentialGroup()
                        .addGroup(selectMovieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(selectMovieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(selectMovieLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(findSeatButton))
                    .addComponent(jScrollPane3)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0))
        );

        pages.addTab("Vælg film", selectMovie);

        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Vælg pladser");

        jScrollPane4.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane4.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane4.setEnabled(false);
        jScrollPane4.setFocusable(false);

        seatSel.setAutoscrolls(false);
        seatSel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        seatSel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        seatSel.getTableHeader().setResizingAllowed(false);
        seatSel.getTableHeader().setReorderingAllowed(false);
        seatSel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                seatSelMouseReleased(evt);
            }
        });
        jScrollPane4.setViewportView(seatSel);

        continueToPaymentButton1.setText("Resever");
        continueToPaymentButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueToPaymentButton1ActionPerformed(evt);
            }
        });

        continueToPaymentButton2.setText("Køb");
        continueToPaymentButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                continueToPaymentButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout selectSeatLayout = new javax.swing.GroupLayout(selectSeat);
        selectSeat.setLayout(selectSeatLayout);
        selectSeatLayout.setHorizontalGroup(
            selectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectSeatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(selectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(selectSeatLayout.createSequentialGroup()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 635, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(selectSeatLayout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(continueToPaymentButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(continueToPaymentButton2)))
                .addContainerGap())
        );
        selectSeatLayout.setVerticalGroup(
            selectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectSeatLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(selectSeatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(continueToPaymentButton1)
                    .addComponent(continueToPaymentButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pages.addTab("Vælg pladser", selectSeat);

        javax.swing.GroupLayout payLayout = new javax.swing.GroupLayout(pay);
        pay.setLayout(payLayout);
        payLayout.setHorizontalGroup(
            payLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tickets)
                .addContainerGap())
        );
        payLayout.setVerticalGroup(
            payLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(payLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tickets)
                .addContainerGap())
        );

        pages.addTab("Betal", pay);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pages, javax.swing.GroupLayout.PREFERRED_SIZE, 649, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pages)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void findSeatButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findSeatButtonActionPerformed
        pages.setSelectedIndex(1);
    }//GEN-LAST:event_findSeatButtonActionPerformed
    
    private void pagesFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_pagesFocusGained
        switch (pages.getSelectedIndex()) {
            case 0:
                findSeatButton.setEnabled(false);
                pages.setEnabledAt(1, false);
                pages.setEnabledAt(2, false);
                break;
            case 1:
                continueToPaymentButton1.setEnabled(false);
                continueToPaymentButton2.setEnabled(false);

                pages.setEnabledAt(1, true);
                pages.setEnabledAt(2, false);
                
                seats = new StringBuilder(radix(movies[selMovie.getSelectedIndex()][2],32,3)).reverse().toString();
                DefaultTableModel tm = (DefaultTableModel) seatSel.getModel();
                
                length = Integer.valueOf(movies[selMovie.getSelectedIndex()][3]);
                
                final int fill = ceil(seats.length()/length)*length - seats.length();
                
                for(int x = 0; x < fill; x++) {
                    seats += "0";
                }
                System.out.println(seats);
                String[] arr = new String[length];
                
                for(int i = 0; i < length; i++)    
                    tm.addColumn("Sæde "+(i+1));
                
                for(int i = 0; i < seats.length(); i+=length) {
                    for(int j = 0; j < length; j++) 
                        arr[j] = seats.charAt(i+j)+"";
                    tm.addRow(arr);
                }
                
                seatSel.setDefaultRenderer(Object.class, new CustomRenderer());
                seatSel.setDefaultEditor(Object.class, null);
                seatSel.getTableHeader().setReorderingAllowed(false);
                seatSel.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
                seatSel.setRowSelectionAllowed(true);
                seatSel.setColumnSelectionAllowed(false);
                seatSel.setCellSelectionEnabled(true);
                seatSel.setModel(tm);
                
                break;
            case 2:
                pages.setEnabledAt(1, true);
                pages.setEnabledAt(2, true);
                
                JPanel allTickets = new JPanel();
                allTickets.setLayout(new BoxLayout(allTickets, BoxLayout.Y_AXIS));
                JPanel[] panels = new JPanel[selectedSeats.size()];
                for(int i = 0; i < panels.length; i++) {
                    panels[i] = new JPanel();
                    panels[i].setLayout(new BoxLayout(panels[i], BoxLayout.Y_AXIS));
                    panels[i].setPreferredSize(new Dimension(300,64));
                    panels[i].setAlignmentX(CENTER_ALIGNMENT);
                    
                    String[] entries = {
                        "Film: "+movies[selMovie.getSelectedIndex()][0],
                        "SAL: "+movies[selMovie.getSelectedIndex()][4]+"    Række "+ ((int)(seats.length()/length)-(int)(selectedSeats.get(i)/length)) +"    Sæde "+ ((int)(selectedSeats.get(i)%length)+1),
                        "Tid: "+selTime.getSelectedValue(),
                        "Gyldig i "+selCinnema.getSelectedValue()+" biograf"
                    };
                    
                    JLabel[] labels = new JLabel[entries.length];
                    for(int j = 0; j < labels.length; j++) {
                        labels[j] = new JLabel(entries[j]);
                        panels[i].add(labels[j]);
                        allTickets.add(panels[i]);
                        allTickets.add(Box.createRigidArea(new Dimension(300,20)));
                    }
                }
                allTickets.add(Box.createRigidArea(new Dimension(300,20)));
                tickets.setViewportView(allTickets);
                tickets.revalidate();
                tickets.repaint();
                validate();
                repaint();
                
                String newseats = "";
                
                for(int i = 0; i < seats.length(); i++) {
                    if(-1 != selectedSeats.lastIndexOf(i))
                        newseats += method.equals("buy") ? '2' : '1';
                    else newseats += seats.charAt(i);
                }
                
                
                System.out.println(seats);
                System.out.println(newseats);
                
                System.out.println(radix(seats,3,32));
                System.out.println(radix(newseats,3,32));
                
                newseats = radix(new StringBuilder(newseats).reverse().toString(),3,32);
                
                try {
                    db.update("'"+newseats+"'", "SÆDER", "NUMMER = "+movies[selMovie.getSelectedIndex()][5], "FILM");
                } catch (SQLException ex) {
                    Logger.getLogger(window.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                break;
        }
    }//GEN-LAST:event_pagesFocusGained
    
    private void selCinnemaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_selCinnemaValueChanged
        try {
            selTime.setSelectedIndex(-1);
            selMovie.setSelectedIndex(-1);
            findSeatButton.setEnabled(false);
            movies = db.select("NAVN, FILMID, SÆDER, RÆKKER, SAL, NUMMER", "FILM", "INNER JOIN OVERSIGT ON FILMID = FILM AND BIOGRAF = "+selCinnema.getSelectedIndex());

            String[] model = new String[movies.length];
            for(int i = 0; i < movies.length; i++)
                model[i] = (String) movies[i][0];
            
            selMovie.setListData(model);
            
        } catch (SQLException ex) {
            Logger.getLogger(window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_selCinnemaValueChanged

    private void selTimeValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_selTimeValueChanged
        if(!selTime.isSelectionEmpty()) findSeatButton.setEnabled(true);
    }//GEN-LAST:event_selTimeValueChanged

    private void selMovieValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_selMovieValueChanged
        try {
            selTime.setSelectedIndex(-1);
            findSeatButton.setEnabled(false);
            String[][] tbl = db.select("START", "FILM", "WHERE FILMID = "+movies[selMovie.getSelectedIndex()][1]+" AND BIOGRAF = "+selCinnema.getSelectedIndex());

            String[] model = new String[tbl.length];
            for(int i = 0; i < tbl.length; i++)
                model[i] = (String) tbl[i][0];
            
            selTime.setListData(model);
            
        } catch (SQLException ex) {
            Logger.getLogger(window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_selMovieValueChanged
    
    private void seatSelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_seatSelMouseReleased
        selectedSeats = new ArrayList();
        
        for(int col : seatSel.getSelectedColumns())
            if(seats.charAt((col+(seatSel.getSelectedRow())*seatSel.getColumnCount())) == '0')
                selectedSeats.add((col+(seatSel.getSelectedRow())*seatSel.getColumnCount()));
        
        if(selectedSeats.size() > 0) {
            continueToPaymentButton1.setEnabled(true);
            continueToPaymentButton2.setEnabled(true);
        } else {
            continueToPaymentButton1.setEnabled(false);
            continueToPaymentButton2.setEnabled(false);
        }
    }//GEN-LAST:event_seatSelMouseReleased
    
    private void continueToPaymentButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueToPaymentButton1ActionPerformed
        method = "reseve";
        pages.setSelectedIndex(2);
    }//GEN-LAST:event_continueToPaymentButton1ActionPerformed

    private void continueToPaymentButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_continueToPaymentButton2ActionPerformed
        method = "buy";
        pages.setSelectedIndex(2);
    }//GEN-LAST:event_continueToPaymentButton2ActionPerformed
    
    Database db;
    String[][] movies;
    ArrayList<Integer> selectedSeats;
    String seats, method = "";
    int length;
            
    public void start() {
        try {            
            db = new Database("jdbc:derby://localhost:1527/bio", "bio", "1234");
            //db.createTables(false);   //Initilizes the database with filler entries
            //db.createTables(true);    //Will reset the database to a default state

            String[][] tbl = db.select("NAVN, ID", "BIOGRAFER");
            String[] model = new String[tbl.length];
            for (String[] row : tbl)
                model[Integer.valueOf(row[1])] = row[0];
            
            selCinnema.setListData(model);
            
        } catch (SQLException | ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(window.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    /**
     * Ceil a double to an integer
     * @param x number
     * @return the greates integer less than or equal to x return as integer
     */
    public static int ceil(double x) {
        return ((int)x)+1;
    }
    
    /**
     * Convert a number formatted as a string to antoher base
     * @param num Number as string
     * @param from numbers current base, base 2 - 36 supported
     * @param to radix to convert to, supports base 2 - 36
     * @return a string representing at number in the new base
     */
    public String radix(String num, int from, int to) {
        return Long.toString(Long.parseUnsignedLong(num, from), to);
    }
    
    /* Not in use
    public int getCinnema(int identifier) {
        for(int i = 1; i < 17; i++) {
            int cin = (identifier - (3 * i)) / 17;
            if(cin == Math.abs(cin)) return cin - 2;
        } return -1;
    }
    
    public int getAuditorium(int identifier) {
        return getCinnema(identifier) / 3 - 1;
    }
    
    public int getIdentifier(int cin, int aud) {
        return (cin*17+aud*3);
    }*/
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(window.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new window().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton continueToPaymentButton1;
    private javax.swing.JButton continueToPaymentButton2;
    private javax.swing.JButton findSeatButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTabbedPane pages;
    private javax.swing.JPanel pay;
    private javax.swing.JTable seatSel;
    private javax.swing.JList<String> selCinnema;
    private javax.swing.JList<String> selMovie;
    private javax.swing.JList<String> selTime;
    private javax.swing.JPanel selectMovie;
    private javax.swing.JPanel selectSeat;
    private javax.swing.JScrollPane tickets;
    // End of variables declaration//GEN-END:variables
}
