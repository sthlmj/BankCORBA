package bankidl;


/**
* bankidl/_BankStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from bank.idl
* Sunday, November 15, 2015 2:40:20 PM CET
*/

public class _BankStub extends org.omg.CORBA.portable.ObjectImpl implements bankidl.Bank
{

  public bankidl.Account newAccount (String name) throws bankidl.BankPackage.rejected
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("newAccount", true);
                $out.write_string (name);
                $in = _invoke ($out);
                bankidl.Account $result = bankidl.AccountHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:bankidl/Bank/rejected:1.0"))
                    throw bankidl.BankPackage.rejectedHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return newAccount (name        );
            } finally {
                _releaseReply ($in);
            }
  } // newAccount

  public bankidl.Account getAccount (String name)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getAccount", true);
                $out.write_string (name);
                $in = _invoke ($out);
                bankidl.Account $result = bankidl.AccountHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getAccount (name        );
            } finally {
                _releaseReply ($in);
            }
  } // getAccount

  public boolean deleteAccount (String acc)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("deleteAccount", true);
                $out.write_string (acc);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return deleteAccount (acc        );
            } finally {
                _releaseReply ($in);
            }
  } // deleteAccount

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:bankidl/Bank:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _BankStub
