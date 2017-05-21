Const ssfSTARTUP = &H7
Dim WSHShell, Application, Fso
Set WSHShell = WScript.CreateObject("WScript.Shell")
Set Application = CreateObject("Shell.Application")
Set Fso = WScript.CreateObject("Scripting.FileSystemObject")
set startupFolder = Application.NameSpace(ssfSTARTUP)
curDir = Fso.GetAbsolutePathName(".")
'WScript.Echo startupFolder.Self.Path
'WScript.Echo curDir
Function MakeDesktopShortcut(path, name, target)
	Dim Shortcut,WorkingDirectory
	Set Shortcut = WSHShell.CreateShortcut(path & "\" & name & ".lnk")
	Shortcut.TargetPath = target
	WorkingDirectory = Fso.GetParentFolderName( target )
	If Fso.FolderExists( WorkingDirectory ) then
		Shortcut.WorkingDirectory = WorkingDirectory
	End If
	Shortcut.Save
End Function
MakeDesktopShortcut startupFolder.Self.Path, "startNode.bat", curDir & "\startNode.bat"

 