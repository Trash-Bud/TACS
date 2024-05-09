/*******************************************************************************
 *************************************************************************
 * This code is 100% auto-generated
 * from:
 *   /DevOpsPipeline/model/devOpsPipeline.ecore
 * using:
 *   /DevOpsPipeline/model/devOpsPipeline.genmodel
 *   org.eclipse.ocl.examples.codegen.oclinecore.OCLinEcoreTables
 *
 * Do not edit it.
 *******************************************************************************/
package devOpsPipeline;

// import devOpsPipeline.DevOpsPipelinePackage;
// import devOpsPipeline.DevOpsPipelineTables;
import java.lang.String;
import org.eclipse.ocl.pivot.TemplateParameters;
import org.eclipse.ocl.pivot.ids.ClassId;
import org.eclipse.ocl.pivot.ids.CollectionTypeId;
import org.eclipse.ocl.pivot.ids.IdManager;
import org.eclipse.ocl.pivot.ids.NsURIPackageId;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorPackage;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreExecutorType;
import org.eclipse.ocl.pivot.internal.library.ecore.EcoreLibraryOppositeProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorFragment;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorOperation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorProperty;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorPropertyWithImplementation;
import org.eclipse.ocl.pivot.internal.library.executor.ExecutorStandardLibrary;
import org.eclipse.ocl.pivot.oclstdlib.OCLstdlibTables;
import org.eclipse.ocl.pivot.utilities.AbstractTables;
import org.eclipse.ocl.pivot.utilities.TypeUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;

/**
 * DevOpsPipelineTables provides the dispatch tables for the devOpsPipeline for use by the OCL dispatcher.
 *
 * In order to ensure correct static initialization, a top level class element must be accessed
 * before any nested class element. Therefore an access to PACKAGE.getClass() is recommended.
 */
public class DevOpsPipelineTables extends AbstractTables
{
	static {
		Init.initStart();
	}

	/**
	 *	The package descriptor for the package.
	 */
	public static final EcoreExecutorPackage PACKAGE = new EcoreExecutorPackage(DevOpsPipelinePackage.eINSTANCE);

	/**
	 *	The library of all packages and types.
	 */
	public static final ExecutorStandardLibrary LIBRARY = OCLstdlibTables.LIBRARY;

	/**
	 *	Constants used by auto-generated code.
	 */
	public static final /*@NonInvalid*/ NsURIPackageId PACKid_http_c_s_s_www_example_org_s_devOpsPipeline = IdManager.getNsURIPackageId("http://www.example.org/devOpsPipeline", null, DevOpsPipelinePackage.eINSTANCE);
	public static final /*@NonInvalid*/ ClassId CLSSid_Action = DevOpsPipelineTables.PACKid_http_c_s_s_www_example_org_s_devOpsPipeline.getClassId("Action", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Branch = DevOpsPipelineTables.PACKid_http_c_s_s_www_example_org_s_devOpsPipeline.getClassId("Branch", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_DownloadArtifactAction = DevOpsPipelineTables.PACKid_http_c_s_s_www_example_org_s_devOpsPipeline.getClassId("DownloadArtifactAction", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Job = DevOpsPipelineTables.PACKid_http_c_s_s_www_example_org_s_devOpsPipeline.getClassId("Job", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Pipeline = DevOpsPipelineTables.PACKid_http_c_s_s_www_example_org_s_devOpsPipeline.getClassId("Pipeline", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_SourceRepo = DevOpsPipelineTables.PACKid_http_c_s_s_www_example_org_s_devOpsPipeline.getClassId("SourceRepo", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_Token = DevOpsPipelineTables.PACKid_http_c_s_s_www_example_org_s_devOpsPipeline.getClassId("Token", 0);
	public static final /*@NonInvalid*/ ClassId CLSSid_UploadArtifactAction = DevOpsPipelineTables.PACKid_http_c_s_s_www_example_org_s_devOpsPipeline.getClassId("UploadArtifactAction", 0);
	public static final /*@NonInvalid*/ IntegerValue INT_0 = ValueUtil.integerValueOf("0");
	public static final /*@NonInvalid*/ CollectionTypeId SET_PRIMid_String = TypeId.SET.getSpecializedId(TypeId.STRING, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ String STR__94_o_92__92__s_124_92__s_e_63_o_63_c_91_92_w_m_93_p_s_e_a_91_92_w_m_93_p_o_92__91_92_w_m_93_p_e_63_$ = "^(\\.\\./|\\./)?(?:[\\w-]+/)*[\\w-]+(\\.[\\w-]+)?$";
	public static final /*@NonInvalid*/ String STR__94_o_https_63_124_ftp_e_c_s_s_91_92_S_s_$_63_35_93_91_92_S_93_a_$ = "^(https?|ftp)://[\\S/$.?#][\\S]*$";
	public static final /*@NonInvalid*/ String STR__94_s_91_94_s_93__a = "^/[^/].*";
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_DownloadArtifactAction = TypeId.BAG.getSpecializedId(DevOpsPipelineTables.CLSSid_DownloadArtifactAction, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId BAG_CLSSid_UploadArtifactAction = TypeId.BAG.getSpecializedId(DevOpsPipelineTables.CLSSid_UploadArtifactAction, false, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Action = TypeId.ORDERED_SET.getSpecializedId(DevOpsPipelineTables.CLSSid_Action, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Branch = TypeId.ORDERED_SET.getSpecializedId(DevOpsPipelineTables.CLSSid_Branch, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_DownloadArtifactAction = TypeId.ORDERED_SET.getSpecializedId(DevOpsPipelineTables.CLSSid_DownloadArtifactAction, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_Job = TypeId.ORDERED_SET.getSpecializedId(DevOpsPipelineTables.CLSSid_Job, true, ValueUtil.ONE_VALUE, ValueUtil.UNLIMITED_VALUE);
	public static final /*@NonInvalid*/ CollectionTypeId ORD_CLSSid_UploadArtifactAction = TypeId.ORDERED_SET.getSpecializedId(DevOpsPipelineTables.CLSSid_UploadArtifactAction, true, ValueUtil.ZERO_VALUE, ValueUtil.UNLIMITED_VALUE);

	/**
	 *	The type parameters for templated types and operations.
	 */
	public static class TypeParameters {
		static {
			Init.initStart();
			DevOpsPipelineTables.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DevOpsPipelineTables::TypeParameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The type descriptors for each type.
	 */
	public static class Types {
		static {
			Init.initStart();
			TypeParameters.init();
		}

		public static final EcoreExecutorType _Action = new EcoreExecutorType(DevOpsPipelinePackage.Literals.ACTION, PACKAGE, 0);
		public static final EcoreExecutorType _Branch = new EcoreExecutorType(DevOpsPipelinePackage.Literals.BRANCH, PACKAGE, 0);
		public static final EcoreExecutorType _DownloadArtifactAction = new EcoreExecutorType(DevOpsPipelinePackage.Literals.DOWNLOAD_ARTIFACT_ACTION, PACKAGE, 0);
		public static final EcoreExecutorType _Job = new EcoreExecutorType(DevOpsPipelinePackage.Literals.JOB, PACKAGE, 0);
		public static final EcoreExecutorType _Pipeline = new EcoreExecutorType(DevOpsPipelinePackage.Literals.PIPELINE, PACKAGE, 0);
		public static final EcoreExecutorType _SourceRepo = new EcoreExecutorType(DevOpsPipelinePackage.Literals.SOURCE_REPO, PACKAGE, 0);
		public static final EcoreExecutorType _Token = new EcoreExecutorType(DevOpsPipelinePackage.Literals.TOKEN, PACKAGE, 0);
		public static final EcoreExecutorType _UploadArtifactAction = new EcoreExecutorType(DevOpsPipelinePackage.Literals.UPLOAD_ARTIFACT_ACTION, PACKAGE, 0);

		private static final EcoreExecutorType /*@NonNull*/ [] types = {
			_Action,
			_Branch,
			_DownloadArtifactAction,
			_Job,
			_Pipeline,
			_SourceRepo,
			_Token,
			_UploadArtifactAction
		};

		/*
		 *	Install the type descriptors in the package descriptor.
		 */
		static {
			PACKAGE.init(LIBRARY, types);
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DevOpsPipelineTables::Types and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragment descriptors for the local elements of each type and its supertypes.
	 */
	public static class Fragments {
		static {
			Init.initStart();
			Types.init();
		}

		private static final ExecutorFragment _Action__Action = new ExecutorFragment(Types._Action, DevOpsPipelineTables.Types._Action);
		private static final ExecutorFragment _Action__OclAny = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Action__OclElement = new ExecutorFragment(Types._Action, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Branch__Branch = new ExecutorFragment(Types._Branch, DevOpsPipelineTables.Types._Branch);
		private static final ExecutorFragment _Branch__OclAny = new ExecutorFragment(Types._Branch, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Branch__OclElement = new ExecutorFragment(Types._Branch, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _DownloadArtifactAction__DownloadArtifactAction = new ExecutorFragment(Types._DownloadArtifactAction, DevOpsPipelineTables.Types._DownloadArtifactAction);
		private static final ExecutorFragment _DownloadArtifactAction__OclAny = new ExecutorFragment(Types._DownloadArtifactAction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _DownloadArtifactAction__OclElement = new ExecutorFragment(Types._DownloadArtifactAction, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Job__Job = new ExecutorFragment(Types._Job, DevOpsPipelineTables.Types._Job);
		private static final ExecutorFragment _Job__OclAny = new ExecutorFragment(Types._Job, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Job__OclElement = new ExecutorFragment(Types._Job, OCLstdlibTables.Types._OclElement);

		private static final ExecutorFragment _Pipeline__OclAny = new ExecutorFragment(Types._Pipeline, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Pipeline__OclElement = new ExecutorFragment(Types._Pipeline, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Pipeline__Pipeline = new ExecutorFragment(Types._Pipeline, DevOpsPipelineTables.Types._Pipeline);

		private static final ExecutorFragment _SourceRepo__OclAny = new ExecutorFragment(Types._SourceRepo, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _SourceRepo__OclElement = new ExecutorFragment(Types._SourceRepo, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _SourceRepo__SourceRepo = new ExecutorFragment(Types._SourceRepo, DevOpsPipelineTables.Types._SourceRepo);

		private static final ExecutorFragment _Token__OclAny = new ExecutorFragment(Types._Token, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _Token__OclElement = new ExecutorFragment(Types._Token, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _Token__Token = new ExecutorFragment(Types._Token, DevOpsPipelineTables.Types._Token);

		private static final ExecutorFragment _UploadArtifactAction__OclAny = new ExecutorFragment(Types._UploadArtifactAction, OCLstdlibTables.Types._OclAny);
		private static final ExecutorFragment _UploadArtifactAction__OclElement = new ExecutorFragment(Types._UploadArtifactAction, OCLstdlibTables.Types._OclElement);
		private static final ExecutorFragment _UploadArtifactAction__UploadArtifactAction = new ExecutorFragment(Types._UploadArtifactAction, DevOpsPipelineTables.Types._UploadArtifactAction);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DevOpsPipelineTables::Fragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The parameter lists shared by operations.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Parameters {
		static {
			Init.initStart();
			Fragments.init();
		}

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DevOpsPipelineTables::Parameters and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The operation descriptors for each operation of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Operations {
		static {
			Init.initStart();
			Parameters.init();
		}

		public static final ExecutorOperation _SourceRepo__commitChanges = new ExecutorOperation("commitChanges", TypeUtil.EMPTY_PARAMETER_TYPES, Types._SourceRepo,
			0, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _SourceRepo__createBranch = new ExecutorOperation("createBranch", TypeUtil.EMPTY_PARAMETER_TYPES, Types._SourceRepo,
			1, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _SourceRepo__createTrigger = new ExecutorOperation("createTrigger", TypeUtil.EMPTY_PARAMETER_TYPES, Types._SourceRepo,
			2, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _SourceRepo__mergeTrigger = new ExecutorOperation("mergeTrigger", TypeUtil.EMPTY_PARAMETER_TYPES, Types._SourceRepo,
			3, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _SourceRepo__notifyChanges = new ExecutorOperation("notifyChanges", TypeUtil.EMPTY_PARAMETER_TYPES, Types._SourceRepo,
			4, TemplateParameters.EMPTY_LIST, null);
		public static final ExecutorOperation _SourceRepo__pushCode = new ExecutorOperation("pushCode", TypeUtil.EMPTY_PARAMETER_TYPES, Types._SourceRepo,
			5, TemplateParameters.EMPTY_LIST, null);

		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DevOpsPipelineTables::Operations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The property descriptors for each property of each type.
	 *
	 * @noextend This class is not intended to be subclassed by clients.
	 * @noinstantiate This class is not intended to be instantiated by clients.
	 * @noreference This class is not intended to be referenced by clients.
	 */
	public static class Properties {
		static {
			Init.initStart();
			Operations.init();
		}

		public static final ExecutorProperty _Action__name = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.ACTION__NAME, Types._Action, 0);
		public static final ExecutorProperty _Action__script = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.ACTION__SCRIPT, Types._Action, 1);
		public static final ExecutorProperty _Action__token = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.ACTION__TOKEN, Types._Action, 2);
		public static final ExecutorProperty _Action__tool = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.ACTION__TOOL, Types._Action, 3);
		public static final ExecutorProperty _Action__Job__action = new ExecutorPropertyWithImplementation("Job", Types._Action, 4, new EcoreLibraryOppositeProperty(DevOpsPipelinePackage.Literals.JOB__ACTION));

		public static final ExecutorProperty _Branch__merge = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.BRANCH__MERGE, Types._Branch, 0);
		public static final ExecutorProperty _Branch__name = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.BRANCH__NAME, Types._Branch, 1);
		public static final ExecutorProperty _Branch__onPush = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.BRANCH__ON_PUSH, Types._Branch, 2);
		public static final ExecutorProperty _Branch__SourceRepo__branch = new ExecutorPropertyWithImplementation("SourceRepo", Types._Branch, 3, new EcoreLibraryOppositeProperty(DevOpsPipelinePackage.Literals.SOURCE_REPO__BRANCH));

		public static final ExecutorProperty _DownloadArtifactAction__name = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.DOWNLOAD_ARTIFACT_ACTION__NAME, Types._DownloadArtifactAction, 0);
		public static final ExecutorProperty _DownloadArtifactAction__uploadartifactaction = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.DOWNLOAD_ARTIFACT_ACTION__UPLOADARTIFACTACTION, Types._DownloadArtifactAction, 1);
		public static final ExecutorProperty _DownloadArtifactAction__Job__downloadartifactaction = new ExecutorPropertyWithImplementation("Job", Types._DownloadArtifactAction, 2, new EcoreLibraryOppositeProperty(DevOpsPipelinePackage.Literals.JOB__DOWNLOADARTIFACTACTION));

		public static final ExecutorProperty _Job__action = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.JOB__ACTION, Types._Job, 0);
		public static final ExecutorProperty _Job__dockerMachine = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.JOB__DOCKER_MACHINE, Types._Job, 1);
		public static final ExecutorProperty _Job__downloadartifactaction = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.JOB__DOWNLOADARTIFACTACTION, Types._Job, 2);
		public static final ExecutorProperty _Job__name = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.JOB__NAME, Types._Job, 3);
		public static final ExecutorProperty _Job__token = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.JOB__TOKEN, Types._Job, 4);
		public static final ExecutorProperty _Job__uploadartifactaction = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.JOB__UPLOADARTIFACTACTION, Types._Job, 5);
		public static final ExecutorProperty _Job__SourceRepo__job = new ExecutorPropertyWithImplementation("SourceRepo", Types._Job, 6, new EcoreLibraryOppositeProperty(DevOpsPipelinePackage.Literals.SOURCE_REPO__JOB));
		public static final ExecutorProperty _Job__UploadArtifactAction__job = new ExecutorPropertyWithImplementation("UploadArtifactAction", Types._Job, 7, new EcoreLibraryOppositeProperty(DevOpsPipelinePackage.Literals.UPLOAD_ARTIFACT_ACTION__JOB));

		public static final ExecutorProperty _Pipeline__sourcerepo = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.PIPELINE__SOURCEREPO, Types._Pipeline, 0);

		public static final ExecutorProperty _SourceRepo__branch = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.SOURCE_REPO__BRANCH, Types._SourceRepo, 0);
		public static final ExecutorProperty _SourceRepo__job = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.SOURCE_REPO__JOB, Types._SourceRepo, 1);
		public static final ExecutorProperty _SourceRepo__location = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.SOURCE_REPO__LOCATION, Types._SourceRepo, 2);
		public static final ExecutorProperty _SourceRepo__name = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.SOURCE_REPO__NAME, Types._SourceRepo, 3);
		public static final ExecutorProperty _SourceRepo__Pipeline__sourcerepo = new ExecutorPropertyWithImplementation("Pipeline", Types._SourceRepo, 4, new EcoreLibraryOppositeProperty(DevOpsPipelinePackage.Literals.PIPELINE__SOURCEREPO));

		public static final ExecutorProperty _Token__token = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.TOKEN__TOKEN, Types._Token, 0);
		public static final ExecutorProperty _Token__Action__token = new ExecutorPropertyWithImplementation("Action", Types._Token, 1, new EcoreLibraryOppositeProperty(DevOpsPipelinePackage.Literals.ACTION__TOKEN));
		public static final ExecutorProperty _Token__Job__token = new ExecutorPropertyWithImplementation("Job", Types._Token, 2, new EcoreLibraryOppositeProperty(DevOpsPipelinePackage.Literals.JOB__TOKEN));

		public static final ExecutorProperty _UploadArtifactAction__artifactName = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.UPLOAD_ARTIFACT_ACTION__ARTIFACT_NAME, Types._UploadArtifactAction, 0);
		public static final ExecutorProperty _UploadArtifactAction__job = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.UPLOAD_ARTIFACT_ACTION__JOB, Types._UploadArtifactAction, 1);
		public static final ExecutorProperty _UploadArtifactAction__name = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.UPLOAD_ARTIFACT_ACTION__NAME, Types._UploadArtifactAction, 2);
		public static final ExecutorProperty _UploadArtifactAction__path = new EcoreExecutorProperty(DevOpsPipelinePackage.Literals.UPLOAD_ARTIFACT_ACTION__PATH, Types._UploadArtifactAction, 3);
		public static final ExecutorProperty _UploadArtifactAction__DownloadArtifactAction__uploadartifactaction = new ExecutorPropertyWithImplementation("DownloadArtifactAction", Types._UploadArtifactAction, 4, new EcoreLibraryOppositeProperty(DevOpsPipelinePackage.Literals.DOWNLOAD_ARTIFACT_ACTION__UPLOADARTIFACTACTION));
		public static final ExecutorProperty _UploadArtifactAction__Job__uploadartifactaction = new ExecutorPropertyWithImplementation("Job", Types._UploadArtifactAction, 5, new EcoreLibraryOppositeProperty(DevOpsPipelinePackage.Literals.JOB__UPLOADARTIFACTACTION));
		static {
			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DevOpsPipelineTables::Properties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The fragments for all base types in depth order: OclAny first, OclSelf last.
	 */
	public static class TypeFragments {
		static {
			Init.initStart();
			Properties.init();
		}

		private static final ExecutorFragment /*@NonNull*/ [] _Action =
			{
				Fragments._Action__OclAny /* 0 */,
				Fragments._Action__OclElement /* 1 */,
				Fragments._Action__Action /* 2 */
			};
		private static final int /*@NonNull*/ [] __Action = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Branch =
			{
				Fragments._Branch__OclAny /* 0 */,
				Fragments._Branch__OclElement /* 1 */,
				Fragments._Branch__Branch /* 2 */
			};
		private static final int /*@NonNull*/ [] __Branch = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _DownloadArtifactAction =
			{
				Fragments._DownloadArtifactAction__OclAny /* 0 */,
				Fragments._DownloadArtifactAction__OclElement /* 1 */,
				Fragments._DownloadArtifactAction__DownloadArtifactAction /* 2 */
			};
		private static final int /*@NonNull*/ [] __DownloadArtifactAction = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Job =
			{
				Fragments._Job__OclAny /* 0 */,
				Fragments._Job__OclElement /* 1 */,
				Fragments._Job__Job /* 2 */
			};
		private static final int /*@NonNull*/ [] __Job = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Pipeline =
			{
				Fragments._Pipeline__OclAny /* 0 */,
				Fragments._Pipeline__OclElement /* 1 */,
				Fragments._Pipeline__Pipeline /* 2 */
			};
		private static final int /*@NonNull*/ [] __Pipeline = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _SourceRepo =
			{
				Fragments._SourceRepo__OclAny /* 0 */,
				Fragments._SourceRepo__OclElement /* 1 */,
				Fragments._SourceRepo__SourceRepo /* 2 */
			};
		private static final int /*@NonNull*/ [] __SourceRepo = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _Token =
			{
				Fragments._Token__OclAny /* 0 */,
				Fragments._Token__OclElement /* 1 */,
				Fragments._Token__Token /* 2 */
			};
		private static final int /*@NonNull*/ [] __Token = { 1,1,1 };

		private static final ExecutorFragment /*@NonNull*/ [] _UploadArtifactAction =
			{
				Fragments._UploadArtifactAction__OclAny /* 0 */,
				Fragments._UploadArtifactAction__OclElement /* 1 */,
				Fragments._UploadArtifactAction__UploadArtifactAction /* 2 */
			};
		private static final int /*@NonNull*/ [] __UploadArtifactAction = { 1,1,1 };

		/**
		 *	Install the fragment descriptors in the class descriptors.
		 */
		static {
			Types._Action.initFragments(_Action, __Action);
			Types._Branch.initFragments(_Branch, __Branch);
			Types._DownloadArtifactAction.initFragments(_DownloadArtifactAction, __DownloadArtifactAction);
			Types._Job.initFragments(_Job, __Job);
			Types._Pipeline.initFragments(_Pipeline, __Pipeline);
			Types._SourceRepo.initFragments(_SourceRepo, __SourceRepo);
			Types._Token.initFragments(_Token, __Token);
			Types._UploadArtifactAction.initFragments(_UploadArtifactAction, __UploadArtifactAction);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DevOpsPipelineTables::TypeFragments and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local operations or local operation overrides for each fragment of each type.
	 */
	public static class FragmentOperations {
		static {
			Init.initStart();
			TypeFragments.init();
		}

		private static final ExecutorOperation /*@NonNull*/ [] _Action__Action = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Action__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Action__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Branch__Branch = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Branch__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Branch__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _DownloadArtifactAction__DownloadArtifactAction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _DownloadArtifactAction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _DownloadArtifactAction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Job__Job = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Job__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Job__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Pipeline__Pipeline = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Pipeline__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Pipeline__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _SourceRepo__SourceRepo = {
			DevOpsPipelineTables.Operations._SourceRepo__commitChanges /* commitChanges() */,
			DevOpsPipelineTables.Operations._SourceRepo__createBranch /* createBranch() */,
			DevOpsPipelineTables.Operations._SourceRepo__createTrigger /* createTrigger() */,
			DevOpsPipelineTables.Operations._SourceRepo__mergeTrigger /* mergeTrigger() */,
			DevOpsPipelineTables.Operations._SourceRepo__notifyChanges /* notifyChanges() */,
			DevOpsPipelineTables.Operations._SourceRepo__pushCode /* pushCode() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SourceRepo__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _SourceRepo__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _Token__Token = {};
		private static final ExecutorOperation /*@NonNull*/ [] _Token__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _Token__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		private static final ExecutorOperation /*@NonNull*/ [] _UploadArtifactAction__UploadArtifactAction = {};
		private static final ExecutorOperation /*@NonNull*/ [] _UploadArtifactAction__OclAny = {
			OCLstdlibTables.Operations._OclAny___lt__gt_ /* _'<>'(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny___eq_ /* _'='(OclSelf[?]) */,
			OCLstdlibTables.Operations._OclAny__oclAsSet /* oclAsSet() */,
			OCLstdlibTables.Operations._OclAny__oclAsType /* oclAsType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInState /* oclIsInState(OclState[?]) */,
			OCLstdlibTables.Operations._OclAny__oclIsInvalid /* oclIsInvalid() */,
			OCLstdlibTables.Operations._OclAny__oclIsKindOf /* oclIsKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsNew /* oclIsNew() */,
			OCLstdlibTables.Operations._OclAny__oclIsTypeOf /* oclIsTypeOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclAny__oclIsUndefined /* oclIsUndefined() */,
			OCLstdlibTables.Operations._OclAny__0_oclLog /* oclLog() */,
			OCLstdlibTables.Operations._OclAny__1_oclLog /* oclLog(String[1]) */,
			OCLstdlibTables.Operations._OclAny__oclType /* oclType() */,
			OCLstdlibTables.Operations._OclAny__oclTypes /* oclTypes() */,
			OCLstdlibTables.Operations._OclAny__toString /* toString() */
		};
		private static final ExecutorOperation /*@NonNull*/ [] _UploadArtifactAction__OclElement = {
			OCLstdlibTables.Operations._OclElement__allInstances /* allInstances(Integer[1]) */,
			OCLstdlibTables.Operations._OclElement__oclAsModelType /* oclAsModelType(TT)(TT[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclBase /* oclBase() */,
			OCLstdlibTables.Operations._OclElement__1_oclBase /* oclBase(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclContainer /* oclContainer() */,
			OCLstdlibTables.Operations._OclElement__oclContents /* oclContents() */,
			OCLstdlibTables.Operations._OclElement__oclExtension /* oclExtension(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__0_oclExtensions /* oclExtensions() */,
			OCLstdlibTables.Operations._OclElement__1_oclExtensions /* oclExtensions(OclStereotype[1]) */,
			OCLstdlibTables.Operations._OclElement__oclIsModelKindOf /* oclIsModelKindOf(OclType[1]) */,
			OCLstdlibTables.Operations._OclElement__oclModelType /* oclModelType() */,
			OCLstdlibTables.Operations._OclElement__oclModelTypes /* oclModelTypes() */
		};

		/*
		 *	Install the operation descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Action__Action.initOperations(_Action__Action);
			Fragments._Action__OclAny.initOperations(_Action__OclAny);
			Fragments._Action__OclElement.initOperations(_Action__OclElement);

			Fragments._Branch__Branch.initOperations(_Branch__Branch);
			Fragments._Branch__OclAny.initOperations(_Branch__OclAny);
			Fragments._Branch__OclElement.initOperations(_Branch__OclElement);

			Fragments._DownloadArtifactAction__DownloadArtifactAction.initOperations(_DownloadArtifactAction__DownloadArtifactAction);
			Fragments._DownloadArtifactAction__OclAny.initOperations(_DownloadArtifactAction__OclAny);
			Fragments._DownloadArtifactAction__OclElement.initOperations(_DownloadArtifactAction__OclElement);

			Fragments._Job__Job.initOperations(_Job__Job);
			Fragments._Job__OclAny.initOperations(_Job__OclAny);
			Fragments._Job__OclElement.initOperations(_Job__OclElement);

			Fragments._Pipeline__OclAny.initOperations(_Pipeline__OclAny);
			Fragments._Pipeline__OclElement.initOperations(_Pipeline__OclElement);
			Fragments._Pipeline__Pipeline.initOperations(_Pipeline__Pipeline);

			Fragments._SourceRepo__OclAny.initOperations(_SourceRepo__OclAny);
			Fragments._SourceRepo__OclElement.initOperations(_SourceRepo__OclElement);
			Fragments._SourceRepo__SourceRepo.initOperations(_SourceRepo__SourceRepo);

			Fragments._Token__OclAny.initOperations(_Token__OclAny);
			Fragments._Token__OclElement.initOperations(_Token__OclElement);
			Fragments._Token__Token.initOperations(_Token__Token);

			Fragments._UploadArtifactAction__OclAny.initOperations(_UploadArtifactAction__OclAny);
			Fragments._UploadArtifactAction__OclElement.initOperations(_UploadArtifactAction__OclElement);
			Fragments._UploadArtifactAction__UploadArtifactAction.initOperations(_UploadArtifactAction__UploadArtifactAction);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DevOpsPipelineTables::FragmentOperations and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of local properties for the local fragment of each type.
	 */
	public static class FragmentProperties {
		static {
			Init.initStart();
			FragmentOperations.init();
		}

		private static final ExecutorProperty /*@NonNull*/ [] _Action = {
			DevOpsPipelineTables.Properties._Action__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DevOpsPipelineTables.Properties._Action__script,
			DevOpsPipelineTables.Properties._Action__token,
			DevOpsPipelineTables.Properties._Action__tool
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Branch = {
			DevOpsPipelineTables.Properties._Branch__merge,
			DevOpsPipelineTables.Properties._Branch__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DevOpsPipelineTables.Properties._Branch__onPush
		};

		private static final ExecutorProperty /*@NonNull*/ [] _DownloadArtifactAction = {
			DevOpsPipelineTables.Properties._DownloadArtifactAction__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DevOpsPipelineTables.Properties._DownloadArtifactAction__uploadartifactaction
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Job = {
			DevOpsPipelineTables.Properties._Job__action,
			DevOpsPipelineTables.Properties._Job__dockerMachine,
			DevOpsPipelineTables.Properties._Job__downloadartifactaction,
			DevOpsPipelineTables.Properties._Job__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DevOpsPipelineTables.Properties._Job__token,
			DevOpsPipelineTables.Properties._Job__uploadartifactaction
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Pipeline = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DevOpsPipelineTables.Properties._Pipeline__sourcerepo
		};

		private static final ExecutorProperty /*@NonNull*/ [] _SourceRepo = {
			DevOpsPipelineTables.Properties._SourceRepo__branch,
			DevOpsPipelineTables.Properties._SourceRepo__job,
			DevOpsPipelineTables.Properties._SourceRepo__location,
			DevOpsPipelineTables.Properties._SourceRepo__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents
		};

		private static final ExecutorProperty /*@NonNull*/ [] _Token = {
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DevOpsPipelineTables.Properties._Token__token
		};

		private static final ExecutorProperty /*@NonNull*/ [] _UploadArtifactAction = {
			DevOpsPipelineTables.Properties._UploadArtifactAction__artifactName,
			DevOpsPipelineTables.Properties._UploadArtifactAction__job,
			DevOpsPipelineTables.Properties._UploadArtifactAction__name,
			OCLstdlibTables.Properties._OclElement__oclContainer,
			OCLstdlibTables.Properties._OclElement__oclContents,
			DevOpsPipelineTables.Properties._UploadArtifactAction__path
		};

		/**
		 *	Install the property descriptors in the fragment descriptors.
		 */
		static {
			Fragments._Action__Action.initProperties(_Action);
			Fragments._Branch__Branch.initProperties(_Branch);
			Fragments._DownloadArtifactAction__DownloadArtifactAction.initProperties(_DownloadArtifactAction);
			Fragments._Job__Job.initProperties(_Job);
			Fragments._Pipeline__Pipeline.initProperties(_Pipeline);
			Fragments._SourceRepo__SourceRepo.initProperties(_SourceRepo);
			Fragments._Token__Token.initProperties(_Token);
			Fragments._UploadArtifactAction__UploadArtifactAction.initProperties(_UploadArtifactAction);

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DevOpsPipelineTables::FragmentProperties and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 *	The lists of enumeration literals for each enumeration.
	 */
	public static class EnumerationLiterals {
		static {
			Init.initStart();
			FragmentProperties.init();
		}

		/**
		 *	Install the enumeration literals in the enumerations.
		 */
		static {

			Init.initEnd();
		}

		/**
		 * Force initialization of the fields of DevOpsPipelineTables::EnumerationLiterals and all preceding sub-packages.
		 */
		public static void init() {}
	}

	/**
	 * The multiple packages above avoid problems with the Java 65536 byte limit but introduce a difficulty in ensuring that
	 * static construction occurs in the disciplined order of the packages when construction may start in any of the packages.
	 * The problem is resolved by ensuring that the static construction of each package first initializes its immediate predecessor.
	 * On completion of predecessor initialization, the residual packages are initialized by starting an initialization in the last package.
	 * This class maintains a count so that the various predecessors can distinguish whether they are the starting point and so
	 * ensure that residual construction occurs just once after all predecessors.
	 */
	private static class Init {
		/**
		 * Counter of nested static constructions. On return to zero residual construction starts. -ve once residual construction started.
		 */
		private static int initCount = 0;

		/**
		 * Invoked at the start of a static construction to defer residual construction until primary constructions complete.
		 */
		private static void initStart() {
			if (initCount >= 0) {
				initCount++;
			}
		}

		/**
		 * Invoked at the end of a static construction to activate residual construction once primary constructions complete.
		 */
		private static void initEnd() {
			if (initCount > 0) {
				if (--initCount == 0) {
					initCount = -1;
					EnumerationLiterals.init();
				}
			}
		}
	}

	static {
		Init.initEnd();
	}

	/*
	 * Force initialization of outer fields. Inner fields are lazily initialized.
	 */
	public static void init() {
		new DevOpsPipelineTables();
	}

	private DevOpsPipelineTables() {
		super(DevOpsPipelinePackage.eNS_URI);
	}
}
