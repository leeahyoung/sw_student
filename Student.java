public static void Addstudent() throws FileNotFoundException, IOException, ClassNotFoundException{
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter writer = new BufferedWriter(new FileWriter("student.txt",true));
      System.out.println("[�л� ���� �Է�]");
      scan.nextLine();
      System.out.print("�й� : ");
      id = reader.readLine();

      if(i>0){
         Idcheck(id);
         s_id[i] = id2;
      }
      else{
         s_id[i] = id;
      }
      System.out.print("�̸� : ");
      name[i] = scan.nextLine();
      System.out.print("�а� : ");
      department[i] = reader.readLine();
      System.out.print("��ȭ��ȣ : ");
      phoneNumber[i] = reader.readLine();
      num++;
      String item = String.format("%s|%s|%s|%s\n",s_id[i],name[i],department[i],phoneNumber[i]);
      writer.write(item);
      writer.close();
      i++;
      System.out.println("�л������� ����Ǿ����ϴ�.");
   }