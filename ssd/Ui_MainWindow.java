
/*
  Ui_MainWindow.java : Class containing defs for the SSD main window in Qt
- Akshat Singhal 2/27/08
 */

/********************************************************************************
 ** Form generated from reading ui file 'SSD_Interface.jui'
 **
 ** Created: Tue Feb 12 06:40:03 2008
 **      by: Qt User Interface Compiler version 4.3.3
 **
 ** WARNING! All changes made in this file will be lost when recompiling ui file!
 ********************************************************************************/
package ssd;
import com.trolltech.qt.core.*;
import com.trolltech.qt.gui.*;


public class Ui_MainWindow extends QWidget
{
	public QAction actionLoad_Directory_Recursive;
	public QAction actionLoad_Directory_Non_Recursive;
	public QAction actionExport_Bins;
	public QAction actionExit;
	public QAction actionYourself;
	public QAction action_c_2008_Akshat_Singhal;
	public QAction actionLoad_Exported_Bins_Directory;
	public QWidget centralwidget;
	public QFrame frame;
	public QTreeWidget docTree;
	public QTabWidget tabWidget_top;
	public QWidget tab;
	public QGraphicsView graphicsView;
	public QWidget tab_data;
	public QComboBox comboBox;
	public QTableWidget tableWidget;
	public QTabWidget tabWidget_bottom;
	public QWidget tab_preview;

	public QWidget tab_3;
	public QFrame frame_2;
	public QSlider verticalSlider;
	public QSlider verticalSlider_2;
	public QSlider verticalSlider_3;
	public QSlider verticalSlider_4;
	public QSlider verticalSlider_5;
	public QSlider verticalSlider_6;
	public QSlider thresholdSlider; 
	public QLabel label_2;
	public QLabel label_3;
	public QLabel label_4;
	public QLabel label_5;
	public QLabel label_6;
	public QLabel label_7;
	public QFrame frame_3;
	public QLabel label;
	public QPushButton pushButton;
	public QPushButton pushButton_2;
	public QPushButton acceptButton;
	public QLabel label_8;
	public QWidget tab_NLP;
	public QTabWidget tabWidget;
	public QWidget tab_6;
	public QListWidget listWidget;
	public QListWidget listWidget_2;
	public QListWidget listWidget_3;
	public QLabel label_9;
	public QLabel label_10;
	public QLabel label_11;
	public QPushButton pushButton_6;
	public QWidget tab_7;
	public QTableWidget tableWidget_2;
	public QRadioButton radioButton;
	public QRadioButton radioButton_2;
	public QWidget tab_subjectivity;
	public QLabel label_12;
	public QLabel label_14;
	public QWidget tab_9;
	public QListWidget listWidget_4;
	public QListWidget listWidget_5;
	public QLabel label_13;
	public QLabel label_15;
	public QPushButton pushButton_7;
	public QWidget tab_4;
	public QTextBrowser textBrowser;
	public QComboBox comboBox_2;
	public QPushButton pushButton_4;
	public QPushButton pushButton_5;
	public QMenuBar menubar;
	public QMenu menuFile;
	public QMenu menuHelp;
	public QStatusBar statusbar;

	public QTextBrowser previewBrowser;

	public QGridLayout grid;
	
	public QTextEdit npartitions; 

	public Ui_MainWindow() { super(); }

	public void setupUi(QMainWindow MainWindow)
	{
		MainWindow.setObjectName("MainWindow");
		MainWindow.resize(new QSize(727, 833).expandedTo(MainWindow.minimumSizeHint()));
	
		// Menu
		//actionLoad_Directory_Recursive = new QAction(MainWindow);
		//actionLoad_Directory_Recursive.setObjectName("actionLoad_Directory_Recursive");
		//actionLoad_Directory_Non_Recursive = new QAction(MainWindow);
		//actionLoad_Directory_Non_Recursive.setObjectName("actionLoad_Directory_Non_Recursive");
		actionExport_Bins = new QAction(MainWindow);
		actionExport_Bins.setObjectName("actionExport_Bins");
		actionExit = new QAction(MainWindow);
		actionExit.setObjectName("actionExit");
		actionYourself = new QAction(MainWindow);
		actionYourself.setObjectName("actionYourself");
		action_c_2008_Akshat_Singhal = new QAction(MainWindow);
		action_c_2008_Akshat_Singhal.setObjectName("action_c_2008_Akshat_Singhal");
		actionLoad_Exported_Bins_Directory = new QAction(MainWindow);
		actionLoad_Exported_Bins_Directory.setObjectName("actionLoad_Exported_Bins_Directory");


		//centralwidget
		centralwidget = new QWidget(MainWindow);
		centralwidget.setObjectName("centralwidget");

		//add frame to the central widget
		frame = new QFrame(centralwidget);
		frame.setObjectName("frame");
		frame.setGeometry(new QRect(0, 0, 721, 811));
		frame.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.NoFrame);
		frame.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);






		//grid = new QGridLayout(MainWindow);
		//grid.addWidget(frame,0, 0, 0, 1);
		//grid.addWidget(frame_2,0,1);
		//grid.addWidget(frame_3,1,1);


		docTree = new QTreeWidget(frame);
		docTree.setObjectName("docTree");
		docTree.setGeometry(new QRect(0, 0, 181, 781));
		docTree.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.WheelFocus);
		docTree.setDragDropMode(com.trolltech.qt.gui.QAbstractItemView.DragDropMode.InternalMove);
		
		
		tabWidget_top = new QTabWidget(frame);
		tabWidget_top.setObjectName("tabWidget_top");
		tabWidget_top.setGeometry(new QRect(180, 0, 541, 341));
		tabWidget_top.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.TabFocus);
		tab = new QWidget();
		tab.setObjectName("tab");

		graphicsView = new QGraphicsView(tab);
		graphicsView.setObjectName("graphicsView");
		
		graphicsView.setGeometry(new QRect(0, 0, 531, 311  ));
		graphicsView.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.WheelFocus);
		
		
		
		//tabWidget_top.addTab(tab, com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Map of Clusteristan"));
		tab_data = new QWidget();
		tab_data.setObjectName("tab_data");
		comboBox = new QComboBox(tab_data);
		comboBox.setObjectName("comboBox");
		comboBox.setGeometry(new QRect(0, 0, 193, 22));
		comboBox.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.WheelFocus);
		tableWidget = new QTableWidget(tab_data);
		tableWidget.setObjectName("tableWidget");
		tableWidget.setGeometry(new QRect(0, 30, 531, 281));
		tableWidget.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.WheelFocus);


		tab_preview = new QWidget();
		tab_preview.setObjectName("tab_preview");
		previewBrowser = new QTextBrowser(tab_preview);
		previewBrowser.setObjectName("previewBrowser");
		previewBrowser.setGeometry(new QRect(0, 0, 531, 311));
		previewBrowser.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.WheelFocus);
		tabWidget_top.addTab(tab_preview, com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Preview"));



		tabWidget_top.addTab(tab_data, com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Medium-Rare Data"));
		tabWidget_bottom = new QTabWidget(frame);
		tabWidget_bottom.setObjectName("tabWidget_bottom");
		tabWidget_bottom.setGeometry(new QRect(180, 340, 541, 441));
		tabWidget_bottom.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.TabFocus);
		tab_3 = new QWidget();
		tab_3.setObjectName("tab_3");

		frame_2 = new QFrame(tab_3);
		frame_2.setObjectName("frame_2");
		frame_2.setGeometry(new QRect(10, 10, 361, 281));
		frame_2.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.NoFrame);
		frame_2.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);

		frame_3 = new QFrame(tab_3);
		frame_3.setObjectName("frame_3");
		frame_3.setGeometry(new QRect(380, 10, 151, 391));
		frame_3.setFrameShape(com.trolltech.qt.gui.QFrame.Shape.NoFrame);
		frame_3.setFrameShadow(com.trolltech.qt.gui.QFrame.Shadow.Raised);

		
		verticalSlider = new QSlider(frame_2);
		verticalSlider.setObjectName("verticalSlider");
		verticalSlider.setGeometry(new QRect(35, 20, 21, 211));
		verticalSlider.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.StrongFocus);
		verticalSlider.setOrientation(com.trolltech.qt.core.Qt.Orientation.Vertical);
		verticalSlider_2 = new QSlider(frame_2);
		verticalSlider_2.setObjectName("verticalSlider_2");
		verticalSlider_2.setGeometry(new QRect(87, 20, 21, 211));
		verticalSlider_2.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.StrongFocus);
		verticalSlider_2.setOrientation(com.trolltech.qt.core.Qt.Orientation.Vertical);
		verticalSlider_3 = new QSlider(frame_2);
		verticalSlider_3.setObjectName("verticalSlider_3");
		verticalSlider_3.setGeometry(new QRect(139, 20, 21, 211));
		verticalSlider_3.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.StrongFocus);
		verticalSlider_3.setOrientation(com.trolltech.qt.core.Qt.Orientation.Vertical);
		verticalSlider_4 = new QSlider(frame_2);
		verticalSlider_4.setObjectName("verticalSlider_4");
		verticalSlider_4.setGeometry(new QRect(191, 20, 21, 211));
		verticalSlider_4.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.StrongFocus);
		verticalSlider_4.setOrientation(com.trolltech.qt.core.Qt.Orientation.Vertical);
		verticalSlider_5 = new QSlider(frame_2);
		verticalSlider_5.setObjectName("verticalSlider_5");
		verticalSlider_5.setGeometry(new QRect(243, 20, 21, 211));
		verticalSlider_5.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.StrongFocus);
		verticalSlider_5.setOrientation(com.trolltech.qt.core.Qt.Orientation.Vertical);
		
		//verticalSlider_6 = new QSlider(frame_2);
		verticalSlider_6 = new QSlider();
		verticalSlider_6.setObjectName("verticalSlider_6");
		verticalSlider_6.setGeometry(new QRect(295, 20, 21, 211));
		verticalSlider_6.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.StrongFocus);
		verticalSlider_6.setOrientation(com.trolltech.qt.core.Qt.Orientation.Vertical);


		verticalSlider.setRange(0, 99);
		verticalSlider.setValue(99);
		verticalSlider_2.setRange(0, 99);
		verticalSlider_2.setValue(99);
		verticalSlider_3.setRange(0, 99);
		verticalSlider_3.setValue(99);
		verticalSlider_4.setRange(0, 99);
		verticalSlider_4.setValue(99);
		verticalSlider_5.setRange(0, 99);
		verticalSlider_5.setValue(99);
		verticalSlider_6.setRange(0, 99);
		verticalSlider_6.setValue(99);



		label_2 = new QLabel(frame_2);
		label_2.setObjectName("label_2");
		label_2.setGeometry(new QRect(20, 240, 46, 14));
		label_3 = new QLabel(frame_2);
		label_3.setObjectName("label_3");
		label_3.setGeometry(new QRect(80, 240, 46, 14));
		label_4 = new QLabel(frame_2);
		label_4.setObjectName("label_4");
		label_4.setGeometry(new QRect(130, 240, 46, 14));
		label_5 = new QLabel(frame_2);
		label_5.setObjectName("label_5");
		label_5.setGeometry(new QRect(180, 240, 46, 14));
		label_6 = new QLabel(frame_2);
		label_6.setObjectName("label_6");
		label_6.setGeometry(new QRect(230, 240, 46, 14));
		
		
		
		label_7 = new QLabel(frame_3);
		label_7 = new QLabel();
		label_7.setObjectName("label_7");
		label_7.setGeometry(new QRect(10, 240, 91, 31));




		npartitions = new QTextEdit(frame_3);		
		npartitions .setObjectName("npartitions ");		
		npartitions .setGeometry(new QRect(10, 270, 91, 31));
		npartitions .setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.WheelFocus);
		npartitions.setText("1");
		

		label = new QLabel(frame_3);
		label.setObjectName("label");
		label.setGeometry(new QRect(10, 10, 131, 31));
		//pushButton = new QPushButton(frame_3);
		pushButton = new QPushButton();
		pushButton.setObjectName("pushButton");
		pushButton.setGeometry(new QRect(10, 230, 91, 31));
		pushButton.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.StrongFocus);
		//pushButton_2 = new QPushButton(frame_3);
		pushButton_2 = new QPushButton();
		pushButton_2.setObjectName("pushButton_2");
		pushButton_2.setGeometry(new QRect(10, 270, 91, 31));
		pushButton_2.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.StrongFocus);
		acceptButton = new QPushButton(frame_3);
		acceptButton.setObjectName("acceptButton");
		acceptButton.setGeometry(new QRect(10, 350, 131, 31));
		acceptButton.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.StrongFocus);
		label_8 = new QLabel(tab_3);
		label_8.setObjectName("label_8");
		label_8.setGeometry(new QRect(30, 280, 331, 101));
		tabWidget_bottom.addTab(tab_3, com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Gearbox"));
		tab_NLP = new QWidget();
		tab_NLP.setObjectName("tab_NLP");
		tabWidget = new QTabWidget(tab_NLP);
		tabWidget.setObjectName("tabWidget");
		tabWidget.setGeometry(new QRect(0, 0, 541, 411));
		tabWidget.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.TabFocus);
		tab_6 = new QWidget();
		tab_6.setObjectName("tab_6");


		//widgets for named entities.
		listWidget = new QListWidget(tab_6);
		listWidget.setObjectName("listWidget");
		listWidget.setGeometry(new QRect(0, 60, 181, 321));
		listWidget.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.WheelFocus);


		listWidget_2 = new QListWidget(tab_6);
		listWidget_2.setObjectName("listWidget_2");
		listWidget_2.setGeometry(new QRect(180, 60, 181, 321));
		listWidget_2.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.WheelFocus);



		listWidget_3 = new QListWidget(tab_6);
		listWidget_3.setObjectName("listWidget_3");
		listWidget_3.setGeometry(new QRect(360, 60, 171, 321));
		listWidget_3.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.WheelFocus);

		label_9 = new QLabel(tab_6);
		label_9.setObjectName("label_9");
		label_9.setGeometry(new QRect(10, 40, 46, 14));
		label_10 = new QLabel(tab_6);
		label_10.setObjectName("label_10");
		label_10.setGeometry(new QRect(190, 40, 91, 16));
		label_11 = new QLabel(tab_6);
		label_11.setObjectName("label_11");
		label_11.setGeometry(new QRect(380, 40, 61, 16));
		pushButton_6 = new QPushButton(tab_6);
		pushButton_6.setObjectName("pushButton_6");
		pushButton_6.setGeometry(new QRect(450, 0, 75, 23));
		pushButton_6.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.StrongFocus);
		tabWidget.addTab(tab_6, com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Named Entities"));
		tab_7 = new QWidget();
		tab_7.setObjectName("tab_7");
		tableWidget_2 = new QTableWidget(tab_7);
		tableWidget_2.setObjectName("tableWidget_2");
		tableWidget_2.setGeometry(new QRect(0, 0, 531, 351));
		tableWidget_2.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.WheelFocus);
		radioButton = new QRadioButton(tab_7);
		radioButton.setObjectName("radioButton");
		radioButton.setGeometry(new QRect(10, 360, 83, 18));
		radioButton.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.StrongFocus);
		radioButton_2 = new QRadioButton(tab_7);
		radioButton_2.setObjectName("radioButton_2");
		radioButton_2.setGeometry(new QRect(110, 360, 101, 18));
		radioButton_2.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.StrongFocus);
		tabWidget.addTab(tab_7, com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Significant Terms"));
		tab_subjectivity = new QWidget();
		tab_subjectivity.setObjectName("tab_subjectivity");
		label_12 = new QLabel(tab_subjectivity);
		label_12.setObjectName("label_12");
		label_12.setGeometry(new QRect(10, 10, 218, 16));
		label_14 = new QLabel(tab_subjectivity);
		label_14.setObjectName("label_14");
		label_14.setGeometry(new QRect(10, 60, 111, 16));

		tabWidget.addTab(tab_subjectivity, com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Subjectivity Analysis"));
		tab_9 = new QWidget();
		tab_9.setObjectName("tab_9");
		listWidget_4 = new QListWidget(tab_9);
		listWidget_4.setObjectName("listWidget_4");
		listWidget_4.setGeometry(new QRect(0, 40, 256, 331));
		listWidget_4.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.WheelFocus);
		listWidget_5 = new QListWidget(tab_9);
		listWidget_5.setObjectName("listWidget_5");
		listWidget_5.setGeometry(new QRect(265, 40, 261, 331));
		listWidget_5.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.WheelFocus);
		label_13 = new QLabel(tab_9);
		label_13.setObjectName("label_13");
		label_13.setGeometry(new QRect(10, 20, 101, 16));
		label_15 = new QLabel(tab_9);
		label_15.setObjectName("label_15");
		label_15.setGeometry(new QRect(280, 20, 46, 14));
		pushButton_7 = new QPushButton(tab_9);
		pushButton_7.setObjectName("pushButton_7");
		pushButton_7.setGeometry(new QRect(434, 0, 91, 23));
		pushButton_7.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.StrongFocus);
		tabWidget.addTab(tab_9, com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Similar/Dissimilar Documents"));


		tabWidget_bottom.addTab(tab_NLP, com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Robot's-Eye View"));
		tab_4 = new QWidget();
		tab_4.setObjectName("tab_4");
		textBrowser = new QTextBrowser(tab_4);
		textBrowser.setObjectName("textBrowser");
		textBrowser.setGeometry(new QRect(0, 30, 531, 381));
		textBrowser.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.WheelFocus);
		comboBox_2 = new QComboBox(tab_4);
		comboBox_2.setObjectName("comboBox_2");
		comboBox_2.setGeometry(new QRect(10, 0, 111, 22));
		comboBox_2.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.WheelFocus);
		pushButton_4 = new QPushButton(tab_4);
		pushButton_4.setObjectName("pushButton_4");
		pushButton_4.setGeometry(new QRect(130, 0, 101, 23));
		pushButton_4.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.StrongFocus);
		pushButton_5 = new QPushButton(tab_4);
		pushButton_5.setObjectName("pushButton_5");
		pushButton_5.setGeometry(new QRect(450, 0, 81, 23));
		pushButton_5.setFocusPolicy(com.trolltech.qt.core.Qt.FocusPolicy.StrongFocus);
		//tabWidget_bottom.addTab(tab_4, com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Dyslexic Summary"));
		
		MainWindow.setCentralWidget(centralwidget);
		menubar = new QMenuBar(MainWindow);
		menubar.setObjectName("menubar");
		menubar.setGeometry(new QRect(0, 0, 727, 21));
		menuFile = new QMenu(menubar);
		menuFile.setObjectName("menuFile");
		menuHelp = new QMenu(menubar);
		menuHelp.setObjectName("menuHelp");
		MainWindow.setMenuBar(menubar);
		statusbar = new QStatusBar(MainWindow);
		statusbar.setObjectName("statusbar");
		MainWindow.setStatusBar(statusbar);

		menubar.addAction(menuFile.menuAction());
		menubar.addAction(menuHelp.menuAction());
		//menuFile.addAction(actionLoad_Directory_Recursive);
		//menuFile.addAction(actionLoad_Directory_Non_Recursive);
		menuFile.addAction(actionExport_Bins);
		menuFile.addAction(actionLoad_Exported_Bins_Directory);
		menuFile.addAction(actionExit);
		menuHelp.addAction(actionYourself);
		menuHelp.addAction(action_c_2008_Akshat_Singhal);
		retranslateUi(MainWindow);

		tabWidget_top.setCurrentIndex(1);
		tabWidget_bottom.setCurrentIndex(0);
		tabWidget.setCurrentIndex(2);




		/*        
        vlayout = new QVBoxLayout();
        vlayout.addWidget(frame_3);
        vlayout.addWidget(frame_2);        
        this.setLayout(vlayout);*/        

		MainWindow.connectSlotsByName();
	} // setupUi

	void retranslateUi(QMainWindow MainWindow)
	{
		MainWindow.setWindowTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "MainWindow"));
//		actionLoad_Directory_Recursive.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "&Load Directory (Recursive).."));
		//actionLoad_Directory_Non_Recursive.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Load Directory (N&on-Recursive).."));
		actionExport_Bins.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "&Export Bins to Training Directory"));
		actionExit.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "E&xit"));
		actionYourself.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Yourself. "));
		action_c_2008_Akshat_Singhal.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "(c) 2008. Akshat Singhal"));
		actionLoad_Exported_Bins_Directory.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Loa&d Exported Bins Directory.."));
		docTree.headerItem().setText(0, com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Suggested Bins"));
		docTree.clear();
		
		QTreeWidgetItem __item = new QTreeWidgetItem(docTree);
		__item.setText(0, com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Bin 2"));
		__item.setIcon(0, new QIcon(new QPixmap("classpath:doc/html/com/trolltech/qt/images/linguist-fileopen.png")));

		QTreeWidgetItem __item1 = new QTreeWidgetItem(__item);
		__item1.setText(0, com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "BIN 1"));

		QTreeWidgetItem __item2 = new QTreeWidgetItem(__item1);
		__item2.setText(0, com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Doc 1"));

		QTreeWidgetItem __item3 = new QTreeWidgetItem(__item1);
		__item3.setText(0, com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Doc2 "));

		QTreeWidgetItem __item4 = new QTreeWidgetItem(docTree);
		__item4.setText(0, com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Bin4"));

		QTreeWidgetItem __item5 = new QTreeWidgetItem(__item4);
		__item5.setText(0, com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Bin 3"));

		QTreeWidgetItem __item6 = new QTreeWidgetItem(__item5);
		__item6.setText(0, com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Doc 3"));

		QTreeWidgetItem __item7 = new QTreeWidgetItem(docTree);
		__item7.setText(0, com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Bin 5"));

		QTreeWidgetItem __item8 = new QTreeWidgetItem(docTree);
		__item8.setText(0, com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Bin 6"));

		tabWidget_top.setTabText(tabWidget_top.indexOf(tab), com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Map of Clusteristan"));

		comboBox.clear();
		comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Cosine Distance"));
		comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Compression Distance"));
		comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Sectioned Distance"));		
		comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "PartsOfSpeech Distance"));
		comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Named Entity Distance"));
		comboBox.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Total Weighted Distance"));
		tableWidget.clear();
		tableWidget.setColumnCount(5);

		QTableWidgetItem __colItem = new QTableWidgetItem();
		__colItem.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "doc1"));
		tableWidget.setHorizontalHeaderItem(0, __colItem);

		QTableWidgetItem __colItem1 = new QTableWidgetItem();
		__colItem1.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "doc2"));
		tableWidget.setHorizontalHeaderItem(1, __colItem1);

		QTableWidgetItem __colItem2 = new QTableWidgetItem();
		__colItem2.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "doc3"));
		tableWidget.setHorizontalHeaderItem(2, __colItem2);

		QTableWidgetItem __colItem3 = new QTableWidgetItem();
		__colItem3.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "doc4"));
		tableWidget.setHorizontalHeaderItem(3, __colItem3);

		QTableWidgetItem __colItem4 = new QTableWidgetItem();
		__colItem4.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", ".."));
		tableWidget.setHorizontalHeaderItem(4, __colItem4);
		tableWidget.setRowCount(5);

		QTableWidgetItem __rowItem = new QTableWidgetItem();
		__rowItem.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "doc1"));
		tableWidget.setVerticalHeaderItem(0, __rowItem);

		QTableWidgetItem __rowItem1 = new QTableWidgetItem();
		__rowItem1.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "doc2"));
		tableWidget.setVerticalHeaderItem(1, __rowItem1);

		QTableWidgetItem __rowItem2 = new QTableWidgetItem();
		__rowItem2.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "doc3"));
		tableWidget.setVerticalHeaderItem(2, __rowItem2);

		QTableWidgetItem __rowItem3 = new QTableWidgetItem();
		__rowItem3.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "doc4"));
		tableWidget.setVerticalHeaderItem(3, __rowItem3);

		QTableWidgetItem __rowItem4 = new QTableWidgetItem();
		__rowItem4.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", ".."));
		tableWidget.setVerticalHeaderItem(4, __rowItem4);

		QTableWidgetItem __item9 = new QTableWidgetItem();
		__item9.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "0"));
		tableWidget.setItem(0, 0, __item9);

		QTableWidgetItem __item10 = new QTableWidgetItem();
		__item10.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", ".4"));
		tableWidget.setItem(0, 1, __item10);

		QTableWidgetItem __item11 = new QTableWidgetItem();
		__item11.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", ".2"));
		tableWidget.setItem(0, 2, __item11);

		QTableWidgetItem __item12 = new QTableWidgetItem();
		__item12.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", ".2"));
		tableWidget.setItem(0, 3, __item12);

		QTableWidgetItem __item13 = new QTableWidgetItem();
		__item13.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", ".5"));
		tableWidget.setItem(1, 0, __item13);

		QTableWidgetItem __item14 = new QTableWidgetItem();
		__item14.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "0"));
		tableWidget.setItem(1, 1, __item14);

		QTableWidgetItem __item15 = new QTableWidgetItem();
		__item15.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", ".45"));
		tableWidget.setItem(1, 2, __item15);

		QTableWidgetItem __item16 = new QTableWidgetItem();
		__item16.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", ".5"));
		tableWidget.setItem(1, 3, __item16);

		QTableWidgetItem __item17 = new QTableWidgetItem();
		__item17.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", ".2"));
		tableWidget.setItem(2, 0, __item17);

		QTableWidgetItem __item18 = new QTableWidgetItem();
		__item18.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", ".2"));
		tableWidget.setItem(2, 1, __item18);

		QTableWidgetItem __item19 = new QTableWidgetItem();
		__item19.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "0"));
		tableWidget.setItem(2, 2, __item19);

		QTableWidgetItem __item20 = new QTableWidgetItem();
		__item20.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", ".2"));
		tableWidget.setItem(2, 3, __item20);

		QTableWidgetItem __item21 = new QTableWidgetItem();
		__item21.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", ".4"));
		tableWidget.setItem(3, 0, __item21);

		QTableWidgetItem __item22 = new QTableWidgetItem();
		__item22.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", ".1"));
		tableWidget.setItem(3, 1, __item22);

		QTableWidgetItem __item23 = new QTableWidgetItem();
		__item23.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", ".6"));
		tableWidget.setItem(3, 2, __item23);

		QTableWidgetItem __item24 = new QTableWidgetItem();
		__item24.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "0"));
		tableWidget.setItem(3, 3, __item24);

		QTableWidgetItem __item25 = new QTableWidgetItem();
		__item25.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "0"));
		tableWidget.setItem(4, 4, __item25);
		tabWidget_top.setTabText(tabWidget_top.indexOf(tab_data), com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Medium-Rare Data"));
		label_2.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "#1"));
		label_3.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "#2"));
		label_4.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "#3"));
		label_5.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "#4"));
		label_6.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "#5"));
		
		label_7.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Min. # of clusters"));
		
		label.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "NO CONFIG FILE LOADED"));
		pushButton.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Load.."));
		pushButton_2.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Save.."));
		acceptButton.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Accept"));
		label_8.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "#1 - Compression Distance\n"+
				"#2 - Named Entity\n"+
				"#3 - Cosine Distance\n"+
				"#4 - Sectioned Distance\n"+
				"#5 - Part-Of-Speech Distance\n"+
		""));
		tabWidget_bottom.setTabText(tabWidget_bottom.indexOf(tab_3), com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Gearbox"));
		label_9.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "PEOPLE"));
		label_10.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "ORGANIZATIONS"));
		label_11.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "LOCATIONS"));
		pushButton_6.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Save As.."));
		tabWidget.setTabText(tabWidget.indexOf(tab_6), com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Named Entities"));
		tableWidget_2.clear();
		tableWidget_2.setColumnCount(4);

		QTableWidgetItem __colItem5 = new QTableWidgetItem();
		__colItem5.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Term"));
		tableWidget_2.setHorizontalHeaderItem(0, __colItem5);

		QTableWidgetItem __colItem6 = new QTableWidgetItem();
		__colItem6.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Freq"));
		tableWidget_2.setHorizontalHeaderItem(1, __colItem6);

		QTableWidgetItem __colItem7 = new QTableWidgetItem();
		__colItem7.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "ClusterFreq"));
		tableWidget_2.setHorizontalHeaderItem(2, __colItem7);

		QTableWidgetItem __colItem8 = new QTableWidgetItem();
		__colItem8.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "ChiSq"));
		tableWidget_2.setHorizontalHeaderItem(3, __colItem8);
		tableWidget_2.setRowCount(1);

		QTableWidgetItem __item26 = new QTableWidgetItem();
		__item26.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "president"));
		tableWidget_2.setItem(0, 0, __item26);

		QTableWidgetItem __item27 = new QTableWidgetItem();
		__item27.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "50"));
		tableWidget_2.setItem(0, 1, __item27);

		QTableWidgetItem __item28 = new QTableWidgetItem();
		__item28.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "500"));
		tableWidget_2.setItem(0, 2, __item28);

		QTableWidgetItem __item29 = new QTableWidgetItem();
		__item29.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", ".18"));
		tableWidget_2.setItem(0, 3, __item29);
		radioButton.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "In Document"));
		radioButton_2.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Against Cluster"));
		tabWidget.setTabText(tabWidget.indexOf(tab_7), com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Significant Terms"));
		label_12.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Subjectivity "));
		label_14.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Polarity"));
		tabWidget.setTabText(tabWidget.indexOf(tab_subjectivity), com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Subjectivity Analysis"));
		label_13.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Similar"));
		label_15.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Dissimilar"));
		pushButton_7.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Save As.."));
		tabWidget.setTabText(tabWidget.indexOf(tab_9), com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Similar/Dissimilar Documents"));
		tabWidget_bottom.setTabText(tabWidget_bottom.indexOf(tab_NLP), com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Robot's-Eye View"));
		textBrowser.setHtml(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "<html><head><meta name=\"qrichtext\" content=\"1\" /><style type=\"text/css\">\n"+
				"p, li { white-space: pre-wrap; }\n"+
				"</style></head><body style=\" font-family:'MS Shell Dlg 2'; font-size:8.25pt; font-weight:400; font-style:normal;\">\n"+
				"<p style=\" margin-top:0px; margin-bottom:0px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px; font-size:8pt;\">&lt;h1&gt; Multi-Document Summary Generated by LexRank &lt;/h1&gt;</p>\n"+
				"<p style=\" margin-top:0px; margin-bottom:0px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px; font-size:8pt;\">&lt;hr&gt;</p>\n"+
		"<p style=\" margin-top:0px; margin-bottom:0px; margin-left:0px; margin-right:0px; -qt-block-indent:0; text-indent:0px; font-size:8pt;\">This pane will contain a summary generated using the LexRank system.</p></body></html>"));
		comboBox_2.clear();
		comboBox_2.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Bin1"));
		comboBox_2.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Bin2"));
		comboBox_2.addItem(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", ".."));
		pushButton_4.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Generate"));
		pushButton_5.setText(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Save As.."));
		tabWidget_bottom.setTabText(tabWidget_bottom.indexOf(tab_4), com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Dyslexic Summary"));
		menuFile.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "File"));
		menuHelp.setTitle(com.trolltech.qt.core.QCoreApplication.translate("MainWindow", "Help"));
				
		
	} // retranslateUi

	protected void resizeEvent(QResizeEvent arg__1){
		//void resizeAction(){
		//DOESN'T WORK
		System.err.println("DIAG: Resize action detected");
		frame.setGeometry(0, 0, 181 , this.height());
		docTree.setGeometry(0, 0, 181 , this.height());


	}
}



