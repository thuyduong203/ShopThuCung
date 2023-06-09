package view;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.HoaDon;
import model.NhanVien;
import repository.NhanVienRepository;
import service.impl.HDCTServiceImpl;
import service.impl.HoaDonService;
import service.impl.NhanVienService;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
/**
 *
 * @author quang
 */
public class ViewNhanVien extends javax.swing.JFrame {

    private List<NhanVien> listNV = new ArrayList<>();
    private DefaultTableModel dtm = new DefaultTableModel();
    private NhanVien nv2;
    private HoaDonService hdImpl = new HoaDonService();
    private HDCTServiceImpl hdctImpl = new HDCTServiceImpl();

    /**
     * Creates new form ViewNhanVien
     */
    public ViewNhanVien(NhanVien nv) {
        initComponents();
        this.nv2 = nv;
        setLocationRelativeTo(null);
        tbHienThi.setModel(dtm);
        String header[] = {"Mã NV", "Tên", "Chức vụ", "Email", "Số điện thoại", "Địa chỉ", "Giới tính", "Lương", "Năm sinh", "Mật khâu"};
        dtm.setColumnIdentifiers(header);
        listNV = new NhanVienService().loadData(listNV);
        showData(listNV);
        rdNam.setSelected(true);
    }

    public void showData(List<NhanVien> listNV) {
        dtm.setRowCount(0);
        for (NhanVien nhanVien : listNV) {
            dtm.addRow(nhanVien.toDataRow());
        }
    }

    public void fillData(int index) {
        txtMaNV.setText(listNV.get(index).getMaNV());
        txtTenNV.setText(listNV.get(index).getTenNV());
        txtChucVu.setText(listNV.get(index).getChucVu());
        txtEmail.setText(listNV.get(index).getEmail());
        txtSDT.setText(listNV.get(index).getSoDienThoai());
        txtDiaChi.setText(listNV.get(index).getDiaChi());
        if (listNV.get(index).isGioiTinh() == true) {
            rdNam.setSelected(true);
        } else {
            rdNu.setSelected(true);
        }
        txtLuong.setText(String.valueOf(listNV.get(index).getLuong()));
        txtNgaySinh.setText(listNV.get(index).getNamSinh());
        txtPass.setText(listNV.get(index).getMatKhau());
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
        cbbSearch = new javax.swing.JComboBox<>();
        txtSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbHienThi = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtMaNV = new javax.swing.JTextField();
        txtTenNV = new javax.swing.JTextField();
        txtNgaySinh = new javax.swing.JTextField();
        txtSDT = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        rdNam = new javax.swing.JRadioButton();
        rdNu = new javax.swing.JRadioButton();
        btnAdd = new javax.swing.JButton();
        btnSua = new javax.swing.JButton();
        btnXoa = new javax.swing.JButton();
        btnThoat = new javax.swing.JButton();
        btnKhachHang = new javax.swing.JButton();
        btnThuCung = new javax.swing.JButton();
        btnHoaDon = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtChucVu = new javax.swing.JTextField();
        txtDiaChi = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtLuong = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtPass = new javax.swing.JTextField();
        cbbThuongPhat = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SHOP THÚ CƯNG");

        cbbSearch.setBackground(new java.awt.Color(192, 241, 255));
        cbbSearch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbbSearch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mã", "Tên" }));

        txtSearch.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        txtSearch.setHighlighter(null);

        btnSearch.setBackground(new java.awt.Color(192, 241, 255));
        btnSearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/timkiem.jpg"))); // NOI18N
        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Danh sách nhân viên");

        tbHienThi.setBackground(new java.awt.Color(192, 241, 255));
        tbHienThi.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(68, 158, 68)));
        tbHienThi.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        tbHienThi.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Mã nhân viên", "Tên", "Ngày sinh", "Chức vụ", "Giới tính", "SĐT", "Email", "Thưởng/Phạt"
            }
        ));
        tbHienThi.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbHienThiMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbHienThi);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Mã nhân viên: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Tên nhân viên: ");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Ngày sinh: ");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Giới tính: ");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Số điện thoại: ");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Email: ");

        txtMaNV.setHighlighter(null);

        txtTenNV.setHighlighter(null);

        txtNgaySinh.setHighlighter(null);

        txtSDT.setHighlighter(null);

        txtEmail.setHighlighter(null);

        buttonGroup1.add(rdNam);
        rdNam.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdNam.setSelected(true);
        rdNam.setText("Nam");

        buttonGroup1.add(rdNu);
        rdNu.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rdNu.setText("Nữ");

        btnAdd.setBackground(new java.awt.Color(192, 241, 255));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Add.png"))); // NOI18N
        btnAdd.setText("Thêm");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
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

        btnKhachHang.setBackground(new java.awt.Color(192, 241, 255));
        btnKhachHang.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnKhachHang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/khachhangp.png"))); // NOI18N
        btnKhachHang.setText("Khách hàng");
        btnKhachHang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKhachHangActionPerformed(evt);
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
        jLabel10.setText("Lương:");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setText("Chức Vụ");

        txtChucVu.setHighlighter(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Địa chỉ:");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Mật khẩu");

        txtPass.setHighlighter(null);

        cbbThuongPhat.setBackground(new java.awt.Color(192, 241, 255));
        cbbThuongPhat.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        cbbThuongPhat.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Thưởng", "Phạt" }));
        cbbThuongPhat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbThuongPhatActionPerformed(evt);
            }
        });

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
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtMaNV)
                                            .addComponent(txtTenNV)
                                            .addComponent(txtNgaySinh)
                                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(rdNam)
                                                .addGap(35, 35, 35)
                                                .addComponent(rdNu)))))
                                .addGap(187, 187, 187)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtChucVu, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(txtEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(txtSDT, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                                    .addComponent(txtLuong)
                                    .addComponent(txtPass))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 511, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnKhachHang)
                                .addGap(53, 53, 53)
                                .addComponent(btnThuCung, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(btnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 517, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbbThuongPhat, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(btnSearch)))))
                        .addGap(70, 70, 70))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKhachHang, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThuCung, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHoaDon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(cbbThuongPhat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(txtLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtChucVu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addGap(42, 42, 42))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtMaNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(rdNam)
                            .addComponent(jLabel7)
                            .addComponent(rdNu))
                        .addGap(32, 32, 32)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSua, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnXoa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnThoat, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        if (txtMaNV.getText().isEmpty() || !txtMaNV.getText().matches("[a-z A-Z]+")) {
            JOptionPane.showMessageDialog(rootPane, "Mã NV không được để trống và phải là chữ");
        } else if (txtTenNV.getText().isEmpty() || !txtTenNV.getText().matches("[a-z A-Z]+")) {
            JOptionPane.showMessageDialog(rootPane, "Tên NV không được để trống và phải là chữ");
        } else if (txtChucVu.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Chức vụ không được để trống và phải là chữ");
        } else if (txtEmail.getText().isEmpty() || !txtEmail.getText().matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")) {
            JOptionPane.showMessageDialog(rootPane, "Email không được để trống và phải đúng định dạng");
        } else if (txtSDT.getText().isEmpty() || !(txtSDT.getText().matches("0[0-9]{8,10}"))) {
            JOptionPane.showMessageDialog(rootPane, "SĐT không được để trống và phải đúng định dạng");
        } else if (txtDiaChi.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Địa chỉ không được để trống");
        } else if (txtLuong.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Luơng không được để trống");
        } else if (txtNgaySinh.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Ngày sinh không được để trống");
        } else if (txtPass.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Mật khẩu không được để trống");
        } else if (txtPass.getText().length() < 8) {
            JOptionPane.showMessageDialog(this, "Mật khẩu phải lớn hơn 8 kí tự");
        } else if (new NhanVienService().getOne(txtMaNV.getText()) != null) {
            JOptionPane.showMessageDialog(rootPane, "Mã đã tồn tại");
        } else {
            String kq = "";
            String maNV = txtMaNV.getText();
            String tenNV = txtTenNV.getText();
            String chucVu = txtChucVu.getText();
            String email = txtEmail.getText();
            String diaChi = txtDiaChi.getText();
            String soDienThoai = txtSDT.getText();
            float luong = Float.valueOf(txtLuong.getText());
            String namSinh = txtNgaySinh.getText();
            String matKhau = txtPass.getText();
            boolean gt = rdNam.isSelected();
            boolean gtt;
            if (gt == true) {
                gtt = true;
            } else {
                gtt = false;
            }
            NhanVien nv1 = new NhanVien(maNV, tenNV, chucVu, email, soDienThoai, diaChi, gtt, Float.valueOf(luong), namSinh, matKhau);
            kq = new NhanVienService().addNV(nv1);
            JOptionPane.showMessageDialog(rootPane, kq);
            listNV = new NhanVienService().loadData(listNV);
            showData(listNV);
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnThoatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThoatActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnThoatActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
        int row = tbHienThi.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn data cần sửa!");
        } else {
            if (txtMaNV.getText().isEmpty() || !txtMaNV.getText().matches("[a-z A-Z]+")) {
                JOptionPane.showMessageDialog(rootPane, "Mã NV không được để trống và phải là chữ");
            } else if (txtTenNV.getText().isEmpty() || !txtTenNV.getText().matches("[a-z A-Z]+")) {
                JOptionPane.showMessageDialog(rootPane, "Tên NV không được để trống và phải là chữ");
            } else if (txtChucVu.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Chức vụ không được để trống và phải là chữ");
            } else if (txtEmail.getText().isEmpty() || !txtEmail.getText().matches("^[a-zA-Z0-9_!#$%&'*+/=?`{|}~^.-]+@[a-zA-Z0-9.-]+$")) {
                JOptionPane.showMessageDialog(rootPane, "Email không được để trống và phải đúng định dạng");
            } else if (txtSDT.getText().isEmpty() || !(txtSDT.getText().matches("0[0-9]{8,10}"))) {
                JOptionPane.showMessageDialog(rootPane, "SĐT không được để trống và phải đúng định dạng");
            } else if (txtDiaChi.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Địa chỉ không được để trống");
            } else if (txtLuong.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Luơng không được để trống");
            } else if (txtNgaySinh.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Ngày sinh không được để trống");
            } else if (txtPass.getText().length() < 8) {
                JOptionPane.showMessageDialog(this, "Mật khẩu phải lớn hơn 8 kí tự");
            } else if (txtPass.getText().isEmpty()) {
                JOptionPane.showMessageDialog(rootPane, "Mật khẩu không được để trống");
            } else {
                String maNV2 = listNV.get(row).getMaNV();
                String kq = "";
                String maNV = txtMaNV.getText();
                String tenNV = txtTenNV.getText();
                String chucVu = txtChucVu.getText();
                String email = txtEmail.getText();
                String diaChi = txtDiaChi.getText();
                String soDienThoai = txtSDT.getText();
                float luong = Float.valueOf(txtLuong.getText());
                String namSinh = txtNgaySinh.getText();
                String matKhau = txtPass.getText();
                boolean gt = rdNam.isSelected();
                boolean gtt;
                if (gt == true) {
                    gtt = true;
                } else {
                    gtt = false;
                }
                NhanVien nv1 = new NhanVien(maNV, tenNV, chucVu, email, soDienThoai, diaChi, gtt, Float.valueOf(luong), namSinh, matKhau);
                kq = new NhanVienService().updateNV(nv1, maNV2);
                JOptionPane.showMessageDialog(rootPane, kq);
                listNV = new NhanVienService().loadData(listNV);
                showData(listNV);
            }
        }
    }//GEN-LAST:event_btnSuaActionPerformed

    private void tbHienThiMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbHienThiMouseClicked
        // TODO add your handling code here:
        int row = tbHienThi.getSelectedRow();
        fillData(row);
    }//GEN-LAST:event_tbHienThiMouseClicked

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
        int row = tbHienThi.getSelectedRow();
        if (row < 0) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn data cần xóa!");
        } else {
            String maNV = txtMaNV.getText();
            List<HoaDon> listHDByMaNV = hdImpl.searchByMaNV(maNV);
            if (hdImpl.searchByMaNV(maNV) != null) {
                for (HoaDon hoaDon : listHDByMaNV) {
                    String xoaHDCT = hdctImpl.delete(hoaDon.getMaHD());
                }
                for (HoaDon hoaDon : listHDByMaNV) {
                    String xoaHD = hdImpl.delete(hoaDon.getMaHD());
                }
            }
            String maNV2 = listNV.get(row).getMaNV();
            String kq = "";
            kq = new NhanVienService().removeNV(maNV2);
            JOptionPane.showMessageDialog(rootPane, kq);
            listNV = new NhanVienService().loadData(listNV);
            showData(listNV);
        }
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnKhachHangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKhachHangActionPerformed
        // TODO add your handling code here:
        ViewKhachHang vkh = new ViewKhachHang(nv2);
        vkh.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnKhachHangActionPerformed

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

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if (cbbSearch.getSelectedItem().equals("Mã")) {
            List<NhanVien> listSearch = new NhanVienService().searchByMa(txtSearch.getText());
            showData(listSearch);
        } else if (cbbSearch.getSelectedItem().equals("Tên")) {
            List<NhanVien> listSearch2 = new NhanVienRepository().searchByTen(txtSearch.getText());
            showData(listSearch2);
        }
    }//GEN-LAST:event_btnSearchActionPerformed

    private void cbbThuongPhatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbThuongPhatActionPerformed
        // TODO add your handling code here:\
        if (cbbThuongPhat.getSelectedItem().equals("Thưởng")) {
            listNV = new NhanVienService().thuongNV();
            showData(listNV);
        } else {
            listNV = new NhanVienService().phatNV();
            showData(listNV);
        }
    }//GEN-LAST:event_cbbThuongPhatActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnHoaDon;
    private javax.swing.JButton btnKhachHang;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnThuCung;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JComboBox<String> cbbSearch;
    private javax.swing.JComboBox<String> cbbThuongPhat;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rdNam;
    private javax.swing.JRadioButton rdNu;
    private javax.swing.JTable tbHienThi;
    private javax.swing.JTextField txtChucVu;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtLuong;
    private javax.swing.JTextField txtMaNV;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtPass;
    private javax.swing.JTextField txtSDT;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtTenNV;
    // End of variables declaration//GEN-END:variables
}
