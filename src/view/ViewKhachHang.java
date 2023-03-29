package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HoaDon;
import model.KhachHang;
import model.NhanVien;
import service.KhachHangService;
import service.impl.HDCTServiceImpl;
import service.impl.HoaDonService;
import service.impl.KhachHangServiceImpl;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author quang
 */
public class ViewKhachHang extends javax.swing.JFrame {

    private DefaultTableModel dtm = new DefaultTableModel();
    private KhachHangService khs = new KhachHangServiceImpl();
    private List<KhachHang> listKhachHang = khs.getAll();
    private HoaDonService hdImpl = new HoaDonService();
    private HDCTServiceImpl hdctImpl = new HDCTServiceImpl();
    private NhanVien nv2;

    /**
     * Creates new form ViewNhanVien
     */
    public ViewKhachHang(NhanVien nv) {
        initComponents();
        setLocationRelativeTo(null);
        this.nv2 = nv;
        if (nv2.getChucVu().compareToIgnoreCase("Nhân viên") == 0) {
            btnNhanVien.setEnabled(false);
        }
        String hd[] = {"Mã Khách Hàng", "Tên Khách Hàng", "Giới Tính", "Số Điện Thoại", "Email", "Địa Chỉ"};
        tbKhachHang.setModel(dtm);
        dtm.setColumnIdentifiers(hd);
        showData(listKhachHang);
    }

    public void showData(List<KhachHang> list) {
        dtm.setRowCount(0);
        for (KhachHang kh : list) {
            dtm.addRow(kh.toDataRow());
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbKhachHang = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMaKH = new javax.swing.JTextField();
        txtTenKH = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        radNam = new javax.swing.JRadioButton();
        radNu = new javax.swing.JRadioButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnThuCung = new javax.swing.JButton();
        btnHoaDon = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SHOP THÚ CƯNG");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Danh sách khách hàng");

        tbKhachHang.setBackground(new java.awt.Color(192, 241, 255));
        tbKhachHang.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 158, 68)));
        tbKhachHang.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbKhachHang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã khách hàng", "Tên khách hàng", "Giới tính", "Số điện thoại", "Email", "Địa chỉ"
            }
        ));
        tbKhachHang.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbKhachHangMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbKhachHang);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mã khách hàng: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Tên khách hàng: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Giới tính: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Số điện thoại: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Email: ");

        txtMaKH.setHighlighter(null);

        txtTenKH.setHighlighter(null);

        txtSDT.setHighlighter(null);

        txtEmail.setHighlighter(null);

        buttonGroup1.add(radNam);
        radNam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radNam.setSelected(true);
        radNam.setText("Nam");

        buttonGroup1.add(radNu);
        radNu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radNu.setText("Nữ");

        btnThem.setBackground(new java.awt.Color(192, 241, 255));
        btnThem.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });

        btnSua.setBackground(new java.awt.Color(192, 241, 255));
        btnSua.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Edit.png"))); // NOI18N
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

        btnXoa.setBackground(new java.awt.Color(192, 241, 255));
        btnXoa.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnXoa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Delete.png"))); // NOI18N
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new java.awt.Color(192, 241, 255));
        btnThoat.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Exit.png"))); // NOI18N
        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThoatActionPerformed(evt);
            }
        });

        btnNhanVien.setBackground(new java.awt.Color(192, 241, 255));
        btnNhanVien.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnNhanVien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/khachhangp.png"))); // NOI18N
        btnNhanVien.setText("Nhân Viên");
        btnNhanVien.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNhanVienActionPerformed(evt);
            }
        });

        btnThuCung.setBackground(new java.awt.Color(192, 241, 255));
        btnThuCung.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnThuCung.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/cho.png"))); // NOI18N
        btnThuCung.setText("Thú cưng");
        btnThuCung.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThuCungActionPerformed(evt);
            }
        });

        btnHoaDon.setBackground(new java.awt.Color(192, 241, 255));
        btnHoaDon.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnHoaDon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/hoadon.jpg"))); // NOI18N
        btnHoaDon.setText("Hóa đơn");
        btnHoaDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHoaDonActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("Địa chỉ:");

        txtDiaChi.setHighlighter(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(133, 133, 133))
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(34, 34, 34)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radNam)
                                        .addGap(71, 71, 71)
                                        .addComponent(radNu))
                                    .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 432, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(284, 284, 284))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnNhanVien)
                                .addGap(53, 53, 53)
                                .addComponent(btnThuCung, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(btnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(40, 40, 40))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThuCung, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMaKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTenKH, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(radNam)
                            .addComponent(radNu)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtSDT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // Thoát
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        if (txtMaKH.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Chọn data cần xóa!");
        } else {
            String maKH = txtMaKH.getText();
            List<HoaDon> listHDByMaKH = hdImpl.searchByMaKH(maKH);
            if (hdImpl.searchByMaKH(maKH) != null) {
                for (HoaDon hoaDon : listHDByMaKH) {
                    String xoaHDCT = hdctImpl.delete(hoaDon.getMaHD());
                }
                for (HoaDon hoaDon : listHDByMaKH) {
                    String xoaHD = hdImpl.delete(hoaDon.getMaHD());
                }
            }
            String delete = khs.delete(maKH);
            JOptionPane.showMessageDialog(rootPane, delete);
            listKhachHang = khs.getAll();
            showData(listKhachHang);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        if (txtMaKH.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Mã khách hàng không được bỏ trống");
        } else if (txtTenKH.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Tên khách hàng không được bỏ trống");
        } else if (!txtTenKH.getText().matches("^[a-zA-z ]+$")) {
            JOptionPane.showMessageDialog(rootPane, "Tên khách hàng sai định dạng");
        } else if (txtSDT.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Số điện thoại không được bỏ trống");
        } else if (!txtSDT.getText().matches("\\d+") || !(txtSDT.getText().matches("0[0-9]{8,10}"))) {
            JOptionPane.showMessageDialog(rootPane, "Số điện thoại sai định dạng");
        } else if (txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Email không được bỏ trống");
        } else if (!txtEmail.getText().matches("\\w+@gmail.com$")) {
            JOptionPane.showMessageDialog(rootPane, "Email sai định dạng");
        } else if (txtDiaChi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Địa chỉ không được bỏ trống");
        } else {
            String ma = txtMaKH.getText();
            String ten = txtTenKH.getText();
            String sdt = txtSDT.getText();
            String diaChi = txtDiaChi.getText();
            String email = txtEmail.getText();
            boolean gender = radNam.isSelected();
            KhachHang kh = new KhachHang(ma, ten, diaChi, gender, sdt, email);
            String update = khs.update(kh, ma);
            JOptionPane.showMessageDialog(rootPane, update);
            listKhachHang = khs.getAll();
            showData(listKhachHang);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // Thêm
        if (txtMaKH.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Mã khách hàng không được bỏ trống");
        } else if (txtTenKH.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Tên khách hàng không được bỏ trống");
        } else if (!txtTenKH.getText().matches("^[a-zA-z ]+$")) {
            JOptionPane.showMessageDialog(rootPane, "Tên khách hàng sai định dạng");
        } else if (txtSDT.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Số điện thoại không được bỏ trống");
        } else if (!txtSDT.getText().matches("\\d+") || !(txtSDT.getText().matches("0[0-9]{8,10}"))) {
            JOptionPane.showMessageDialog(rootPane, "Số điện thoại sai định dạng");
        } else if (txtEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Email không được bỏ trống");
        } else if (!txtEmail.getText().matches("\\w+@gmail.com$")) {
            JOptionPane.showMessageDialog(rootPane, "Email sai định dạng");
        } else if (txtDiaChi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Địa chỉ không được bỏ trống");
        } else if (khs.getOne(txtMaKH.getText()) != null) {
            JOptionPane.showMessageDialog(rootPane, "Mã đã tồn tại!");
        } else {
            String ma = txtMaKH.getText();
            String ten = txtTenKH.getText();
            String sdt = txtSDT.getText();
            String diaChi = txtDiaChi.getText();
            String email = txtEmail.getText();
            boolean gender = radNam.isSelected();
            KhachHang kh = new KhachHang(ma, ten, diaChi, gender, sdt, email);
            String add = khs.add(kh);
            JOptionPane.showMessageDialog(rootPane, add);
            listKhachHang = khs.getAll();
            showData(listKhachHang);
        }
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        // TODO add your handling code here:
        ViewNhanVien vnv = new ViewNhanVien(nv2);
        vnv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnThuCungActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThuCungActionPerformed
        // TODO add your handling code here:
        ViewThuCung vtc = new ViewThuCung(nv2);
        vtc.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnThuCungActionPerformed

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
        // TODO add your handling code here:
        ViewHoaDon vhd = new ViewHoaDon(nv2);
        vhd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHoaDonActionPerformed

    private void tbKhachHangMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbKhachHangMouseClicked
        // TODO add your handling code here:
        int row = tbKhachHang.getSelectedRow();
        KhachHang kh = listKhachHang.get(row);
        txtMaKH.setText(kh.getMaKH());
        txtTenKH.setText(kh.getTenKH());
        txtSDT.setText(String.valueOf(kh.getSDT()));
        txtDiaChi.setText(kh.getDiaChi());
        txtEmail.setText(kh.getEmail());
        if (kh.isGioiTinh()) {
            radNam.setSelected(true);
        } else {
            radNu.setSelected(true);
        }
    }//GEN-LAST:event_tbKhachHangMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnThuCung;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton radNam;
    private javax.swing.JRadioButton radNu;
    private javax.swing.JTable tbKhachHang;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtMaKH;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtTenKH;
    // End of variables declaration//GEN-END:variables
}