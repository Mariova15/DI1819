﻿#pragma checksum "..\..\..\interfaz\MaterialesAvituallamiento.xaml" "{ff1816ec-aa5e-4d10-87f7-6f4963833460}" "2389A507D6AA132F5A7B716E75A9192FB1680309"
//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.42000
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

using System;
using System.Diagnostics;
using System.Windows;
using System.Windows.Automation;
using System.Windows.Controls;
using System.Windows.Controls.Primitives;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Ink;
using System.Windows.Input;
using System.Windows.Markup;
using System.Windows.Media;
using System.Windows.Media.Animation;
using System.Windows.Media.Effects;
using System.Windows.Media.Imaging;
using System.Windows.Media.Media3D;
using System.Windows.Media.TextFormatting;
using System.Windows.Navigation;
using System.Windows.Shapes;
using System.Windows.Shell;


namespace GestionAvituallamiento {
    
    
    /// <summary>
    /// MaterialesAvituallamiento
    /// </summary>
    public partial class MaterialesAvituallamiento : System.Windows.Window, System.Windows.Markup.IComponentConnector {
        
        
        #line 6 "..\..\..\interfaz\MaterialesAvituallamiento.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.DataGrid DataGridMaterial;
        
        #line default
        #line hidden
        
        
        #line 8 "..\..\..\interfaz\MaterialesAvituallamiento.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button ButtonEditar;
        
        #line default
        #line hidden
        
        
        #line 9 "..\..\..\interfaz\MaterialesAvituallamiento.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button ButtonBorrar;
        
        #line default
        #line hidden
        
        
        #line 10 "..\..\..\interfaz\MaterialesAvituallamiento.xaml"
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1823:AvoidUnusedPrivateFields")]
        internal System.Windows.Controls.Button ButtonAnnadir;
        
        #line default
        #line hidden
        
        private bool _contentLoaded;
        
        /// <summary>
        /// InitializeComponent
        /// </summary>
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "4.0.0.0")]
        public void InitializeComponent() {
            if (_contentLoaded) {
                return;
            }
            _contentLoaded = true;
            System.Uri resourceLocater = new System.Uri("/GestionAvituallamiento;component/interfaz/materialesavituallamiento.xaml", System.UriKind.Relative);
            
            #line 1 "..\..\..\interfaz\MaterialesAvituallamiento.xaml"
            System.Windows.Application.LoadComponent(this, resourceLocater);
            
            #line default
            #line hidden
        }
        
        [System.Diagnostics.DebuggerNonUserCodeAttribute()]
        [System.CodeDom.Compiler.GeneratedCodeAttribute("PresentationBuildTasks", "4.0.0.0")]
        [System.ComponentModel.EditorBrowsableAttribute(System.ComponentModel.EditorBrowsableState.Never)]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Design", "CA1033:InterfaceMethodsShouldBeCallableByChildTypes")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Maintainability", "CA1502:AvoidExcessiveComplexity")]
        [System.Diagnostics.CodeAnalysis.SuppressMessageAttribute("Microsoft.Performance", "CA1800:DoNotCastUnnecessarily")]
        void System.Windows.Markup.IComponentConnector.Connect(int connectionId, object target) {
            switch (connectionId)
            {
            case 1:
            this.DataGridMaterial = ((System.Windows.Controls.DataGrid)(target));
            return;
            case 2:
            this.ButtonEditar = ((System.Windows.Controls.Button)(target));
            
            #line 8 "..\..\..\interfaz\MaterialesAvituallamiento.xaml"
            this.ButtonEditar.Click += new System.Windows.RoutedEventHandler(this.ButtonEditar_Click);
            
            #line default
            #line hidden
            return;
            case 3:
            this.ButtonBorrar = ((System.Windows.Controls.Button)(target));
            
            #line 9 "..\..\..\interfaz\MaterialesAvituallamiento.xaml"
            this.ButtonBorrar.Click += new System.Windows.RoutedEventHandler(this.ButtonBorrar_Click);
            
            #line default
            #line hidden
            return;
            case 4:
            this.ButtonAnnadir = ((System.Windows.Controls.Button)(target));
            
            #line 10 "..\..\..\interfaz\MaterialesAvituallamiento.xaml"
            this.ButtonAnnadir.Click += new System.Windows.RoutedEventHandler(this.ButtonAnnadir_Click);
            
            #line default
            #line hidden
            return;
            }
            this._contentLoaded = true;
        }
    }
}

