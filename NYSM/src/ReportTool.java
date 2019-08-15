
class ReportTool extends Tool {
	 public void export() {
		System.out.println("RTool::export");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tool aTool=new ReportTool();
		Tool bTool=new Tool();
		callExport(aTool);
		callExport(bTool);
	}
	public static void callExport(Exportable ex) {
		// TODO Auto-generated method stub
		ex.export();
	}

}
