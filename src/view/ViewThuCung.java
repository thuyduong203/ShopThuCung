package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import javax.swing.table.DefaultTableModel;
import model.HoaDonChiTiet;
import model.NhanVien;
import model.ThuCung;
import service.impl.HDCTServiceImpl;
import service.impl.ThuCungServiceImpl;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author quang
 */
public class ViewThuCung extends javax.swing.JFrame {

    /**
     * Creates new form ViewNhanVien
     */
    private DefaultTableModel dtm;
    private List<ThuCung> listThuCungs;
    private int index;
    private ThuCungServiceImpl service = new ThuCungServiceImpl();
    private NhanVien nv2;
    private HDCTServiceImpl hdctImpl = new HDCTServiceImpl();

    public ViewThuCung(NhanVien nv) {
        initComponents();
        setLocationRelativeTo(null);
        this.nv2 = nv;
        if (nv2.getChucVu().compareToIgnoreCase("Nhân viên") == 0) {
            btnNhanVien.setEnabled(false);
        }
        dtm = new DefaultTableModel();
        listThuCungs = new ArrayList<>();
        listThuCungs = new ThuCungServiceImpl().getAll();
        tbHienThi.setModel(dtm);
        String headers[] = {"Mã thú cưng", "Số lượng", "Giống loài", "Màu lông", "Giá bán", "Giới tính"};
        dtm.setColumnIdentifiers(headers);
        fillToTable(listThuCungs);
    }

    private void fillToTable(List<ThuCung> listThuCung) {
        dtm.setRowCount(0);
        for (ThuCung thuCung : listThuCung) {
            dtm.addRow(thuCung.toDataRowThuCung());
        }
    }

    private void fillIndex() {
        ThuCung thuCung = listThuCungs.get(index);
        txtMaThuCung.setText(thuCung.getMaThuCung());
        txtSoLuong.setText(thuCung.getSoLuong() + "");
        txtGiongLoai.setText(thuCung.getGiongLoai());
        txtMauLong.setText(thuCung.getMauLong());
        txtGiaBan.setText(thuCung.getGiaBan() + "");
        if (thuCung.isGioiTinh()) {
            radioDuc.setSelected(true);
        } else {
            radioCai.setSelected(true);
        }
        tbHienThi.setRowSelectionAllowed(true);
        tbHienThi.setRowSelectionInterval(index, index);
    }

    private boolean validateForm() {
        if (txtMaThuCung.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã thú cưng đang trống");
            return false;
        }
        if (!txtMaThuCung.getText().matches("[a-z A-z]+")) {
            JOptionPane.showMessageDialog(this, "Mã thú cưng là chữ");
            return false;
        }
        if (txtSoLuong.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Số lượng đang trống");
            return false;
        }
        if (!txtSoLuong.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(this, "Số lượng là số");
            return false;
        }
        if (Integer.valueOf(txtSoLuong.getText()) <= 0) {
            JOptionPane.showMessageDialog(this, "Số lượng phải lớn hơn 0");
            return false;
        }
        if (txtGiongLoai.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Giống loài đang trống");
            return false;
        }
        if (!txtGiongLoai.getText().matches("[a-z A-z]+")) {
            JOptionPane.showMessageDialog(this, "Giống loài là chữ");
            return false;
        }
        if (!radioDuc.isSelected() && !radioCai.isSelected()) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn giới tính");
            return false;
        }
        if (txtMauLong.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Màu lông đang trống");
            return false;
        }
        if (!txtMauLong.getText().matches("[a-z A-z]+")) {
            JOptionPane.showMessageDialog(this, "Màu lông là chữ");
            return false;
        }
        if (txtGiaBan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Giá bán đang trống");
            return false;
        }
        if (!txtGiaBan.getText().matches("[0-9]+")) {
            JOptionPane.showMessageDialog(this, "Giá bán là số");
            return false;
        }
        if (Double.parseDouble(txtGiaBan.getText()) <= 0) {
            JOptionPane.showMessageDialog(this, "Giá bán phải lớn hơn 0");
            return false;
        }
        return true;
    }

    private void clearForm() {
        txtMaThuCung.setText("");
        txtSoLuong.setText("");
        txtGiaBan.setText("");
        txtGiongLoai.setText("");
        txtMauLong.setText("");
        buttonGroup1.clearSelection();
        tbHienThi.setRowSelectionAllowed(false);
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
        tbHienThi = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMaThuCung = new javax.swing.JTextField();
        txtSoLuong = new javax.swing.JTextField();
        txtGiongLoai = new javax.swing.JTextField();
        txtMauLong = new javax.swing.JTextField();
        radioDuc = new javax.swing.JRadioButton();
        radioCai = new javax.swing.JRadioButton();
        btnThem = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnNhanVien = new javax.swing.JButton();
        btnKhachHang = new javax.swing.JButton();
        btnHoaDon = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        txtGiaBan = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SHOP THÚ CƯNG");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Danh sách thú cưng");

        tbHienThi.setBackground(new java.awt.Color(192, 241, 255));
        tbHienThi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 158, 68)));
        tbHienThi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbHienThi.setModel(new javax.swing.table.DefaultTableModel(
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
                "Mã thú cưng", "Số lượng", "Giới tính", "Giống loài", "Màu lông", "Giá bán"
            }
        ));
        tbHienThi.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        tbHienThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHienThiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbHienThi);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mã thú cưng: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Số lượng:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Giới tính: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Giống loài:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Màu lông:");

        txtMaThuCung.setHighlighter(null);

        txtSoLuong.setHighlighter(null);

        txtGiongLoai.setHighlighter(null);

        txtMauLong.setHighlighter(null);

        buttonGroup1.add(radioDuc);
        radioDuc.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radioDuc.setSelected(true);
        radioDuc.setText("Đực");

        buttonGroup1.add(radioCai);
        radioCai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        radioCai.setText("Cái");

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
        btnSua.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Up.png"))); // NOI18N
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

        btnKhachHang.setBackground(new java.awt.Color(192, 241, 255));
        btnKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/User.png"))); // NOI18N
        btnKhachHang.setText("Khách hàng");
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
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
        jLabel10.setText("Giá bán: ");

        txtGiaBan.setHighlighter(null);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(btnNhanVien)
                                .addGap(53, 53, 53)
                                .addComponent(btnKhachHang)
                                .addGap(38, 38, 38)
                                .addComponent(btnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(250, 250, 250)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(radioDuc)
                                        .addGap(71, 71, 71)
                                        .addComponent(radioCai))
                                    .addComponent(txtMaThuCung, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 435, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtMauLong, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtGiongLoai, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(280, 280, 280))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(474, 474, 474)))
                        .addGap(70, 70, 70))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNhanVien, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtGiongLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtMauLong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtGiaBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMaThuCung, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtSoLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(radioDuc)
                            .addComponent(radioCai))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnThem, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
        if (addView() != null) {
            String kq = new ThuCungServiceImpl().add(addView());
            JOptionPane.showMessageDialog(rootPane, kq);
            listThuCungs = new ThuCungServiceImpl().getAll();
            fillToTable(listThuCungs);
        }
    }//GEN-LAST:event_btnThemActionPerformed
    public ThuCung addView() {
        if (txtMaThuCung.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã ko được trống");
            return null;
        } else if (txtGiongLoai.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Giống loài ko được trống");
            return null;
        } else if (txtMauLong.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Màu lông ko được trống");
            return null;
        } else if (txtGiaBan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Giá ko được trống");
            return null;
        } else if (!(txtGiaBan.getText().matches("[0-9]+")) || (Integer.valueOf(txtGiaBan.getText()) <= 0)) {
            JOptionPane.showMessageDialog(this, "Giá bán phải > 0");
            return null;
        } else if (!(txtSoLuong.getText().matches("[0-9]+")) || (Integer.valueOf(txtSoLuong.getText()) <= 0)) {
            JOptionPane.showMessageDialog(this, "Số lượng phải > 0");
            return null;
        } else if (txtSoLuong.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Số lượng ko được trống");
            return null;
        } else if (new ThuCungServiceImpl().getOne(txtMaThuCung.getText()) != null) {
            JOptionPane.showMessageDialog(this, "Mã đã tồn tại!");
            return null;
        } else {
            String ma = txtMaThuCung.getText();
            String soLuong = txtSoLuong.getText();
            String giongLoai = txtGiongLoai.getText();
            String mau = txtMauLong.getText();
            double giaBan = Double.valueOf(txtGiaBan.getText());
            boolean gioiTinh = radioDuc.isSelected();
            boolean gtt;
            if (gioiTinh == true) {
                gtt = true;;
            } else {
                gtt = false;
            }
            ThuCung tc = new ThuCung(ma, Integer.valueOf(soLuong), giongLoai, mau, Double.valueOf(giaBan), gtt);
            return tc;
        }
    }

    public ThuCung update() {
        if (txtMaThuCung.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Mã ko được trống");
            return null;
        } else if (txtGiongLoai.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Giống loài ko được trống");
            return null;
        } else if (txtMauLong.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Màu lông ko được trống");
            return null;
        } else if (txtGiaBan.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Giá ko được trống");
            return null;
        } else if (!(txtGiaBan.getText().matches("[0-9]+")) || (Integer.valueOf(txtGiaBan.getText()) <= 0)) {
            JOptionPane.showMessageDialog(this, "Giá bán phải > 0");
            return null;
        } else if (!(txtSoLuong.getText().matches("[0-9]+")) || (Integer.valueOf(txtSoLuong.getText()) <= 0)) {
            JOptionPane.showMessageDialog(this, "Số lượng phải > 0");
            return null;
        } else if (txtSoLuong.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Số lượng ko được trống");
            return null;
        } else {
            String ma = txtMaThuCung.getText();
            String soLuong = txtSoLuong.getText();
            String giongLoai = txtGiongLoai.getText();
            String mau = txtMauLong.getText();
            double giaBan = Double.valueOf(txtGiaBan.getText());
            boolean gioiTinh = radioDuc.isSelected();
            boolean gtt;
            if (gioiTinh == true) {
                gtt = true;;
            } else {
                gtt = false;
            }
            ThuCung tc = new ThuCung(ma, Integer.valueOf(soLuong), giongLoai, mau, Double.valueOf(giaBan), gtt);
            return tc;
        }
    }
    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int row = tbHienThi.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Chọn data cần sửa");
        } else {
            String kq = new ThuCungServiceImpl().updateTC(update(), listThuCungs.get(row).getMaThuCung());
            JOptionPane.showMessageDialog(rootPane, kq);
            listThuCungs = new ThuCungServiceImpl().getAll();
            fillToTable(listThuCungs);
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int row = tbHienThi.getSelectedRow();
        String maThuCung = txtMaThuCung.getText();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Chọn data cần xóa");
        } else {
            List<HoaDonChiTiet> lisHDCTByMaThuCung = hdctImpl.getByMaThuCung(maThuCung);
            if (hdctImpl.getByMaThuCung(maThuCung) != null) {
                for (HoaDonChiTiet hoaDonChiTiet : lisHDCTByMaThuCung) {
                    String xoaHDCT = hdctImpl.delete(hoaDonChiTiet.getMaHD().getMaHD());
                }
            }
            String kq = new ThuCungServiceImpl().removeTC(listThuCungs.get(row).getMaThuCung());
            JOptionPane.showMessageDialog(rootPane, kq);
            listThuCungs = new ThuCungServiceImpl().getAll();
            fillToTable(listThuCungs);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void tbHienThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHienThiMouseClicked
        // TODO add your handling code here:
        index = tbHienThi.getSelectedRow();
        fillIndex();
    }//GEN-LAST:event_tbHienThiMouseClicked

    private void btnNhanVienActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNhanVienActionPerformed
        // TODO add your handling code here:
        ViewNhanVien vnv = new ViewNhanVien(nv2);
        vnv.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnNhanVienActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        // TODO add your handling code here:
        ViewKhachHang vkh = new ViewKhachHang(nv2);
        vkh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKhachHangActionPerformed

    private void btnHoaDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHoaDonActionPerformed
        // TODO add your handling code here:
        ViewHoaDon vhd = new ViewHoaDon(nv2);
        vhd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnHoaDonActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnNhanVien;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnThoat;
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
    private javax.swing.JRadioButton radioCai;
    private javax.swing.JRadioButton radioDuc;
    private javax.swing.JTable tbHienThi;
    private javax.swing.JTextField txtGiaBan;
    private javax.swing.JTextField txtGiongLoai;
    private javax.swing.JTextField txtMaThuCung;
    private javax.swing.JTextField txtMauLong;
    private javax.swing.JTextField txtSoLuong;
    // End of variables declaration//GEN-END:variables

}
