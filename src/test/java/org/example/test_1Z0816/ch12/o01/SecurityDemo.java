package org.example.test_1Z0816.ch12.o01;

import java.io.FilePermission;
import java.security.Permission;
import java.security.Policy;

/**
 *
 * 要讓 SecurityManager 在命令列上生效，您有兩種主要方法來啟用它：
 * 1. System.setSecurityManager(new SecurityManager());
 * 2. java -Djava.security.manager
 * --------------------
 * -Djava.security.manager 是 Java 執行時期環境的命令列選項，用於啟用 Java 安全管理器（SecurityManager）。
 * 在 Java 平台中，安全管理器是一個重要的特性，它提供了一種機制來增強應用程式或applet的安全性，透過施加一系列的安全性策略來限制 Java 程式碼可以執行的操作。
 * 功能和用途
 * 安全管理器主要用於以下場景：
 *    限制存取：它可以限制對關鍵資源的訪問，如檔案系統、網路、系統屬性等。
 *    執行權限檢查：當應用程式嘗試執行可能對系統安全性造成影響的操作時，安全管理器執行權限檢查。
 *    沙箱模型：在某些環境下（如瀏覽器中執行的 Java applet），安全管理器用於實作沙箱模型，限製程式碼的執行範圍，防止惡意行為。
 * 啟用安全管理器
 * 若要在 Java 應用程式中啟用安全管理器，可以在命令列中使用 -Djava.security.manager 選項。 例如：
 *    java -Djava.security.manager -jar application.jar
 * 在這個命令中，-Djava.security.manager 指示 JVM 在啟動時實例化並設定預設的安全管理器。
 * 客製化安全策略
 *    啟用安全性管理器後，您可以透過安全性原則檔案來定義特定的安全性策略。 這個文件列出了應用程式所允許和不允許執行的操作。
 *    例如，您可以限制應用程式只能讀取特定的目錄，或禁止它開啟網路連線。
 * 注意事項
 *    在現代Java應用中，直接使用安全管理器已變得較少見，尤其是自 Java 9 引入模組系統以來，對類別載入器和模組的控制更加精細。
 *    安全管理器可能會對應用程式效能產生影響，因為它會在執行各種操作時進行額外的權限檢查。
 *    正確配置安全性策略需要對應用程式的安全需求有深入了解。
 *    總的來說，-Djava.security.manager 用於在 Java 應用程式中啟用安全管理器，這是一種強化應用安全性的機制。 然而，隨著Java平台的發展，這個機制的直接使用變得不那麼普遍。
 * --------------------
 * SecurityManager 類別的主要功能是對 Java 應用程式的安全敏感操作執行檢查。 這些操作包括：
 *    檔案系統存取：控制對檔案和目錄的讀寫存取。
 *    網路存取：管理對網路資源的訪問，例如開啟網路連線。
 *    系統資源存取：限制對系統屬性和環境變數的存取。
 *    類別載入與反射：監控類別的載入以及對反射API的使用。
 *    執行緒操作：管理對執行緒的控制，例如啟動和停止執行緒。
 *    動態程式碼載入：控制類別和程式碼的動態載入。
 * --------------------
 *  Java 安全模型
 *    1.安全管理器（SecurityManager）：SecurityManager 是 Java 安全模型的核心，它決定了應用程式是否有權執行特定的操作。
 *        這些操作可能涉及檔案系統存取、網路通訊、建立新的類別載入器等。
 *    2.策略（Policy）：Policy 類別表示 Java 應用程式的安全性原則。 它負責定義應用程式的權限集合，這些權限指定了程式碼可以執行哪些操作。
 *    3.權限（Permissions）：Java 安全模型使用 java.security.Permission 類別及其子類別來表示權限。每個 Permission 物件代表了進行特定操作的能力。
 *        權限可以非常具體，例如 FilePermission 允許對特定檔案的讀寫操作，SocketPermission 允許對特定主機和連接埠的網路存取等。
 *  如何工作
 *      執行一個操作時，如讀取檔案或開啟網路連接，SecurityManager 會檢查是否有相應的權限。
 *      SecurityManager 會查詢 Policy，以決定目前執行上下文（例如，執行的程式碼的身分、來源等）是否擁有執行該操作所需的 Permission。
 *      如果 Policy 表示目前上下文擁有適當的權限，則操作將允許操作。 否則，將會拋出 SecurityException。
 *  定義權限
 *      權限通常在策略文件中定義，策略文件是一個特定格式的文件，其中指定了不同代碼來源的權限。
 *      開發者可以透過編寫自訂的策略文件來精確控制應用程式的安全策略。
 *  總結
 *      在 Java 的安全模型中，Policy 定義了一組權限，這些權限代表了可以執行的操作。SecurityManager 根據這些策略來決定是否允許執行特定的操作。
 *      因此，Permissions 是定義安全性原則的基本構件，而 Policy 則管理這些權限的集合。
 *
 */
public class SecurityDemo {
    public static void main(String[] args) {
        // 要使用SecurityManager來限制Java程式只能存取特定的文件，您需要執行下列步驟：
        // 1. 建立安全性原則文件：例如 mysecurity.policy。
        // 2. 启用安全管理器：在您的Java程序中，需要设置安全管理器并指定安全策略文件。您可以在程序启动时添。
        System.setProperty("java.security.policy", "path/to/mysecurity.policy");

        // 更新安全策略，增加了靈活性和適應性。如果省略這行代碼，則安全策略將不會根據運行時的更改進行更新，
        // 而是保持 JVM 啟動時加載的狀態。在需要動態更新安全策略的場合，需要包括這行代碼。
        Policy.getPolicy().refresh();

        System.setSecurityManager(new SecurityManager());
        // 3. 運行程式並測試：
        //    運行您的程序，並測試是否只能存取指定的檔案目錄。 如果程式嘗試存取未授權的文件，將會拋出SecurityException。

        // 一旦在Java應用程式中啟用了SecurityManager，它通常會對整個Java虛擬機器實例產生全域影響，這包括所有的執行緒。
        //    換句話說，當您透過呼叫System.setSecurityManager(new SecurityManager());
        //    設定了安全管理器之後，這個安全管理器會對目前JVM實例中的所有執行緒執行的安全敏感操作進行檢查。
        // 安全管理器的全域性質
        //    執行緒間的影響：安全管理器設定後，它的策略將適用於所有執行緒。 無論這些線程是主線程創建的，還是由其他線程派生的，它們都會受到相同的安全限制。
        //    程式碼中的位置：通常，安全管理器是在應用程式的啟動階段設定的，以確保從一開始就施加安全策略。 一旦設置，它將持續有效，直到程序終止或安全管理器被更換或移除。
        // 注意事項
        //   效能考慮：因為安全管理器會對所有執行緒的安全敏感操作進行檢查，所以在某些情況下，它可能會對應用程式的效能產生影響。
        //   策略設計：需要仔細設計安全策略，以確保不會意外阻止合法操作或導致程式死鎖。
        //   測試：由於安全管理器的影響是全域性的，因此在實際部署前應該在開發和測試環境中充分測試安全性策略。


        // 設置自定義的 SecurityManager
        System.setSecurityManager(new SecurityManager() {
            @Override
            public void checkPermission(Permission perm) {
                // 檢查是否有文件讀取權限
                if (perm instanceof FilePermission && "read".equals(perm.getActions())) {
                    // 如果試圖讀取特定文件，拋出 SecurityException
                    if (perm.getName().equals("/path/to/forbidden/file.txt")) {
                        throw new SecurityException("讀取該文件被禁止");
                    }
                }
            }
        });

        // 嘗試讀取兩個不同的文件
        readFile("/path/to/allowed/file.txt");
        readFile("/path/to/forbidden/file.txt");
    }

    private static void readFile(String filePath) {
        try {
            // 模擬文件讀取操作
            System.out.println("嘗試讀取文件: " + filePath);
            // 實際的文件讀取邏輯應該放在這裡（例如使用 FileReader）

            System.out.println("文件讀取成功: " + filePath);
        } catch (SecurityException e) {
            System.out.println("安全管理器阻止讀取文件: " + filePath);
        }
    }
}
